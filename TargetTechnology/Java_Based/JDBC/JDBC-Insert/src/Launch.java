import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Launch {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/JDBC";
        String user = "root";
        String pass = "Hacker@anuj001";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            String sql = "INSERT INTO employee VALUES (102, 'Anuj', 95000)";

            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " record inserted");

            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
