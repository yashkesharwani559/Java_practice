import java.io.FileReader;
import java.io.FileNotFoundException;

public class H1 {
    
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
        pqr();//compilation error here
        System.out.println("C1");
    }

    static void pqr() throws FileNotFoundException{
        System.out.println("D");
        FileReader fr = new FileReader("abc.txt");
        System.out.println("D");
    }
}

// H1.java:22: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         pqr();//compilation error here
//            ^
// 1 error
// error: compilation failed