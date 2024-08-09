import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/college_db?user=root&password=1234");

            String query = "update students set name=?, email=?, password=?, college=? where student_id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.print("Enter student Name: ");
            ps.setString(1, sc.nextLine());

            System.out.print("Enter student Email: ");
            ps.setString(2, sc.nextLine());

            System.out.print("Enter student password: ");
            ps.setString(3, sc.nextLine());

            System.out.print("Enter student college: ");
            ps.setString(4, sc.nextLine());
            
            System.out.print("Enter student ID: ");
            ps.setInt(5, sc.nextInt());

            System.out.println("~~~~~~~~~~~~~~~~~~~");

            int res = ps.executeUpdate();

            System.out.println(res);

            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
