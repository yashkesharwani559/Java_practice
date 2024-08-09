import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class I {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/college_db?user=root&password=1234");

            String query = "insert into students (name, email, password, college, dob) values (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, "Yogesh");
            ps.setString(2, "yogesh@gmail.com");
            ps.setString(3, "234252");
            ps.setString(4, "GGCT");
            ps.setDate(5, new Date(9345889895l));// here we have passed object of the Date class present in java.sql
                                                 // package.

            ps.executeUpdate();

            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

// java.util.Date class is a class present in the java.util package.

// java.sql.Date, java.sql.Time, java.sql.TimeStamp, these all three are classes
// present in java.sql package which are the direct child class of the
// java.util.Date class.

// java.sql.Date contains a constructor that is long parameterized
// Date(long date)

// to store a date type object in the sql we have to store the Date class object
// of the java.sql package