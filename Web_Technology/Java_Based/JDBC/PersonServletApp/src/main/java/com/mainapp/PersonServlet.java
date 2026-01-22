package com.mainapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 1. Read form data
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        int age = Integer.parseInt(ageStr);

        try {
        	// Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. JDBC Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "Hacker@anuj001"
            );

            // 3. Insert query
            String sql = "INSERT INTO person(name, age) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);

            ps.executeUpdate();

            // 4. Display response
            out.println("<h2>Data Saved Successfully</h2>");
            out.println("<p>Name: " + name + "</p>");
            out.println("<p>Age: " + age + "</p>");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            out.println(e);
        }
    }
}
