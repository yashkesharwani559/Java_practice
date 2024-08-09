import java.io.FileReader;

public class M {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (ArithmeticException e) {
            System.out.println("solution");
        }
    }
}
//this is because there is no appropriate catch for the FileNotFoundException
// so we can say that there must be a catch for the try generating the checked exception or we can say there must be a catch for each and every checked exception

//this will give compilation error as
// M.java:6: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//             FileReader fr = new FileReader("abc.txt");
//                             ^
// 1 error
// error: compilation failed