import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class B {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/college_db?user=root&password=1234");

            String query = "insert into students (name, email, password, college) values ('raj', 'raj@google.com', '395601', 'Global')";

            PreparedStatement ps = con.prepareStatement(query);

            int res = ps.executeUpdate();

            System.out.println(res);

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("hello");
    }
}
// if we try to run this code more than once, then this will give the
// java.sql.SQLIntegrityConstraintViolationException exception which is a checked exception and a child class of the SQLException
