import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class J {

    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/college_db?user=root&password=1234");

            String query = "insert into students (name, email, password, college, dob) values (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            System.out.println(ps);

            ps.setString(1, "Yogesh");
            ps.setString(2, "yogesh@gmail.com");
            ps.setString(3, "234252");
            ps.setString(4, "GGCT");
            ps.setDate(5, new Date(9345889895l));// here we have passed object of the Date class present in java.sql
                                                 // package.

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println(ps);

            System.out.println("\n\n");

            int val = ps.executeUpdate();

            if (val > 0) {
                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()) {
                    // System.out.println(rs.getInt("student_id"));// this will not work because it will not assign any
                    // label to the column
                    System.out.println(rs.getInt(1));
                }

            }

            con.close();
        }

        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}