import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.Console;

public class G {
    public static void main(String[] args) {

        Console console = System.console();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/college_db?user=root&password=1234");

            String query = "delete from students where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.print("Enter student ID: ");
            ps.setInt(1, Integer.parseInt(console.readLine()));

            System.out.println("~~~~~~~~~~~~~~~~~~~");

            int res = ps.executeUpdate();

            System.out.println(res);

            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
