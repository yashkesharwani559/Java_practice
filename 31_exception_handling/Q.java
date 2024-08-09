import java.io.IOException;

public class Q {
    void pro() {

    }
}

class XX7 extends Q{
    void pro() throws IOException{

    }
}
//compilation error

//because if the overriding method in the parent class throws no exception then the overridden method of the child class cannot throw any exception

// Q.java:10: error: pro() in XX7 cannot override pro() in Q
//     void pro() throws IOException{
//          ^
//   overridden method does not throw IOException
// 1 error
// error: compilation failed