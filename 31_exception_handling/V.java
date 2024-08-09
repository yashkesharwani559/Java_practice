import java.io.IOException;

public class V {
    void pro() throws IndexOutOfBoundsException{

    }
}

class XX11 extends V{
    void pro() throws IOException{
        
    }
}
//compilation error
// because no new checked exception can be thrown from the overridden child class method

// V.java:10: error: pro() in XX11 cannot override pro() in V
//     void pro() throws IOException{
//          ^
//   overridden method does not throw IOException
// 1 error
// error: compilation failed