import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class K {

    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/college_db?user=root&password=1234");

            String query = "insert into students (name, email, password, college, dob) values ('aaa', 'aaa@gmail.com', '111', 'mno', '2011-01-25'),('bbb', 'bbb@gmail.com', '222', 'pqr', '2001-07-11'),('ccc', 'ccc@gmail.com', '333', 'xyz', '1999-05-10')";

            PreparedStatement ps = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println(ps);

            System.out.println("\n\n");

            int val = ps.executeUpdate();

            if (val > 0) {
                ResultSet rs = ps.getGeneratedKeys();

                while (rs.next()) {
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