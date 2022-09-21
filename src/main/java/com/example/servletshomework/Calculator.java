package com.example.servletshomework;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "calculatorServlet", value = "/calculator-servlet")
public class Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/calculator.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            double number1 = Double.parseDouble(req.getParameter("number1"));
            double number2 = Double.parseDouble(req.getParameter("number2"));
            String op = req.getParameter("select-operation");

            double result;

            switch (op) {
                case "+" -> result = number1 + number2;
                case "-" -> result = number1 - number2;
                case "*" -> result = number1 * number2;
                case "/" -> result = number1 / number2;
                default -> throw new RuntimeException("Не поддерживымаемый оператор");
            }

            HttpSession session = req.getSession();
            session.setAttribute("result", result);
            session.setAttribute("number1", number1);
            session.setAttribute("number2", number2);

            resp.sendRedirect(req.getContextPath() + "/calculator.jsp");
        } catch (RuntimeException e) {
            // перенаправление запроса на страницу с ошибкой
            ServletContext sContext = getServletContext();
            RequestDispatcher rDispatcher =
                    sContext.getRequestDispatcher("/ErrorServlet");
            rDispatcher.forward(req, resp);
        }
    }
}
