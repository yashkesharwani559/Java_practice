import java.io.FileReader;
import java.io.FileNotFoundException;

public class H {
    
    public static void main(String[] args) {

        System.out.println("A");
        abc();
        System.out.println("A1");

    }
    
    static void abc() {
        System.out.println("B");
        mno();
        System.out.println("B1");
    }

    static void mno() {
        System.out.println("C");
        pqr();
        System.out.println("C1");
    }

    static void pqr() {
        System.out.println("D");
        FileReader fr = new FileReader("abc.txt");//compilation error here
        System.out.println("D");
    }
}
//compilation fail

// H.java:28: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error
// error: compilation failed