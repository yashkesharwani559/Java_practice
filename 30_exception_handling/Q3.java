import java.io.FileReader;

public class Q3 {
    public static void main(String[] args) throws ArithmeticException{
        FileReader fr = new FileReader("abc.txt");
    }
}

//compilation error as
// Q3.java:5: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error
// error: compilation failed