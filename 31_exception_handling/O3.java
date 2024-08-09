import java.io.FileNotFoundException;
import java.io.IOException;

public class O3 {
    void pro() throws FileNotFoundException{
        System.out.println("O");
    }
}

class XX4 extends O3 {
    void pro() throws IOException {
        System.out.println("XX1");
    }
}
//compilation error
// because overridden method cannot throw parent class exception

// O3.java:11: error: pro() in XX4 cannot override pro() in O3
//     void pro() throws IOException {
//          ^
//   overridden method does not throw IOException
// 1 error
// error: compilation failed