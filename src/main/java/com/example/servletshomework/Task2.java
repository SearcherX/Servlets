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

@WebServlet(name = "task2Servlet", value = "/task2-servlet")
public class Task2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/task2.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            double number1 = Double.parseDouble(req.getParameter("number1"));
            double number2 = Double.parseDouble(req.getParameter("number2"));
            double number3 = Double.parseDouble(req.getParameter("number3"));

            double min = Math.min(Math.min(number1, number2), number3);
            double max = Math.max(Math.max(number1, number2), number3);
            double avg = (number1 + number2 + number3) / 3;

            HttpSession session = req.getSession();
            session.setAttribute("min", min);
            session.setAttribute("max", max);
            session.setAttribute("avg", avg);
            session.setAttribute("number1", number1);
            session.setAttribute("number2", number2);
            session.setAttribute("number3", number3);

            resp.sendRedirect(req.getContextPath() + "/task2.jsp");
        } catch (RuntimeException e) {
            // перенаправление запроса на страницу с ошибкой
            ServletContext sContext = getServletContext();
            RequestDispatcher rDispatcher =
                    sContext.getRequestDispatcher("/ErrorServlet");
            rDispatcher.forward(req, resp);
        }
    }
}
