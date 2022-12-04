package com.example.demo;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public HelloServlet() {
        super();
    }

    public void init() {
        message = "Hello World!";
        System.out.println("this is init from helloServlet");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("received a post request");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println(request);
        System.out.println(request.getLocale());
        System.out.println(request.getContentLength());

        // Printing to stream
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        System.out.println(request.getServletContext().getAttribute(""));
    }


    public void destroy() {
    }
}
