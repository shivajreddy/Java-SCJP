package com.example.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet(name = "myGenericServlet", value = "/gen")
public class MyGenericServlet extends GenericServlet {
    private int num;

    public void init() {
        System.out.println("init is running");
        num = 21;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter pw = servletResponse.getWriter();
        pw.println("<html><body>");
        pw.println("<h1>" + num + "</h1>");
        pw.println("</body></html>");
    }
}
