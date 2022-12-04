package com.example.demo;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "session-servlet", value = "/session")
public class MyServlet extends HttpServlet {

    public MyServlet() {
        super();
    }

    public void init() {
        System.out.println("this is init in myServlet");
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HttpSession session = req.getSession();
        System.out.println(session);
        System.out.println(req.getLocale());

        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "hi" + "</h1>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("got the post request");
        System.out.println("req = " + req);

        System.out.println(req.getParameter("input_name"));
        System.out.println(req.getParameterNames());

        System.out.println(Arrays.asList(req.getParameterNames()));

        // sending a response
        res.setStatus(300);

    }
}

