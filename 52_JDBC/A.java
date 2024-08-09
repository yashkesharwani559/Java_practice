import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class A {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");//this is also the Driver class. this is in the com.mysql.jdbc package. But this is deprecated that's why this will give a warning
            //this will also stores the records in the table but this Driver class is deprecated. You can use the Driver class in com.mysql.

            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/college_db?user=root&password=1234");
            
            String query = "insert into students (name, email, password, college) values ('raj', 'raj@google.com', '395601', 'Global')";

            PreparedStatement ps = con.prepareStatement(query);

            int res = ps.executeUpdate();

            System.out.println(res);

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
// SQLException is a checked exception present in java.sql package.