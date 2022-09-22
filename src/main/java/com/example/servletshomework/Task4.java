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
import java.util.HashSet;

@WebServlet(name="task4Servlet", value = "/task4-servlet")
public class Task4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect(req.getContextPath() + "/templates/jsp//task4.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String vowels = "AEIOUYАЕЁИОУЫЭЮЯ";
            String consonants = "BCDFGHJKLMNPQRSTVWXYZБВГДЖЗЙКЛМНПРСТФХЧЦШЩ";
            String punctuationMarks = ".,!?;-";
            String sourceTxt = req.getParameter("txt");

            int vowelsNumber = 0;
            int consonantsNumber = 0;
            int punctuationMarksNumber = 0;

            HashSet<Character> curVowels = new HashSet<>();
            HashSet<Character> curConsonants = new HashSet<>();
            HashSet<Character> curPunctuationMarks = new HashSet<>();

            for (int i = 0; i < sourceTxt.length(); i++) {
                char curSymbol = sourceTxt.toUpperCase().charAt(i);
                if (vowels.indexOf(curSymbol) != -1) {
                    curVowels.add(Character.toLowerCase(curSymbol));
                    vowelsNumber++;
                }
                else if (consonants.indexOf(curSymbol) != -1) {
                    curConsonants.add(Character.toLowerCase(curSymbol));
                    consonantsNumber++;
                }
                else if (punctuationMarks.indexOf(curSymbol) != -1) {
                    curPunctuationMarks.add(Character.toLowerCase(curSymbol));
                    punctuationMarksNumber++;
                }
            }

            HttpSession session = req.getSession();
            session.setAttribute("txt", sourceTxt);
            session.setAttribute("vowels", curVowels);
            session.setAttribute("consonants", curConsonants);
            session.setAttribute("punctuationMarks", curPunctuationMarks);
            session.setAttribute("vowelsNumber", vowelsNumber);
            session.setAttribute("consonantsNumber", consonantsNumber);
            session.setAttribute("punctuationMarksNumber", punctuationMarksNumber);
            resp.sendRedirect(req.getContextPath() + "/templates/jsp//task4.jsp");
        } catch (RuntimeException e) {
            // перенаправление запроса на страницу с ошибкой
            ServletContext sContext = getServletContext();
            RequestDispatcher rDispatcher =
                    sContext.getRequestDispatcher("/templates/jsp//ErrorServlet");
            rDispatcher.forward(req, resp);
        }
    }
}
