import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class H {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/college_db?user=root&password=1234");

            String query = "select * from students;";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Student Id: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Email: "
                        + rs.getString(3) + ", Password: " + rs.getString(4) + ", College: " + rs.getString(5));
                System.out.println(
                        "Student Id: " + rs.getInt("student_id") + ", Name: " + rs.getString("name") + ", Email: "
                                + rs.getString("email") + ", Password: " + rs.getString("password") + ", College: "
                                + rs.getString("college"));

                System.out.println("~~~~~~~~~");

            }

            con.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
