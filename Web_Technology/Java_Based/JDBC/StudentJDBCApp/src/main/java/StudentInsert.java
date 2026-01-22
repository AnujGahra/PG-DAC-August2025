import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/StudentInsert")
public class StudentInsert extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver.class");

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "Hacker@anuj001"
            );

            // SQL Query
            String sql = "INSERT INTO student(name, email, mobile) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, mobile);

            int i = ps.executeUpdate();

            if (i > 0) {
                out.println("<h3>Student Registered Successfully!</h3>");
            } else {
                out.println("<h3>Registration Failed</h3>");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            out.println(e);
        }
    }
}
