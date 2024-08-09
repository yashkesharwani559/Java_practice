import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/college_db?user=root&password=1234");
               
            String query = "insert into students (name, email, password, college) value(?, ?, ?, ?)";//SQLException because no value is given to store
                    
            PreparedStatement ps = con.prepareStatement(query);



            int res = ps.executeUpdate();

            System.out.println(res);

            con.close();        
            
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }

        sc.close();
    }
}

// java.sql.SQLException: No value specified for parameter 1
//         at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:130)
//         at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122)
//         at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdateInternal(ClientPreparedStatement.java:1077)
//         at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdateInternal(ClientPreparedStatement.java:1003)
//         at com.mysql.cj.jdbc.ClientPreparedStatement.executeLargeUpdate(ClientPreparedStatement.java:1312)
//         at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdate(ClientPreparedStatement.java:988)
//         at C.main(C.java:24)
//         at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//         at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//         at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//         at java.base/java.lang.reflect.Method.invoke(Method.java:566)
//         at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:404)
//         at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:179)
//         at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:119)