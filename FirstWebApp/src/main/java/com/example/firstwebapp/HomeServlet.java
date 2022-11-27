package com.example.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "homeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    private String param1 = null;
    private int count;

    // # init method
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        param1 = config.getInitParameter("param-1");
        count = 0;
    }

    // # GET method
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println(getServletContext().getInitParameter("algorithm"));
        System.out.println(request.getServletContext().getInitParameter("db-name"));
        System.out.println(this.getServletContext().getInitParameter("db-name"));

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "/home url" + "</h1>");
        out.println("<h1>Init param-1: " + param1 + "</h1>");
        out.print("<h3>count: " + count + "</h3>");
        out.println("</body></html>");
    }


    // # POST method
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println("<h1>Init param-1: " + param1 + "</h1>");

        String givenParam = req.getParameter("param");
        this.param1 = givenParam;
        count++;

        out.print("<h3>givenParam: " + givenParam + "</h3>");
        out.print("<h3>count: " + count + "</h3>");
    }

    public void destroy() {
    }
}
