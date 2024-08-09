import java.io.FileReader;
import java.io.FileNotFoundException;

//handleing checked exception using try-catch block

public class B {
    public static void main(String[] args) {

        System.out.println(1);

        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println(2);

    }
}
//here catch runs because abc.txt doesnot exist

//output

// 1
// java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
// 2
