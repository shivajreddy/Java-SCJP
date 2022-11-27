package com.example.firstwebapp;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class Employee {
    private int id;
    private String name;
    private String dept;
    private int salary;

    public Employee(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

@WebServlet(name = "testServlet", value = "/test")
public class TestServlet extends HttpServlet {
    private Gson gson = new Gson();

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        Employee employee = new Employee(1, "shiva", "it", 5000);
        String employeeJsonString = this.gson.toJson(employee);

        PrintWriter out = res.getWriter();
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        System.out.println(employeeJsonString);
        out.print(employeeJsonString);
        out.flush();
    }
}
