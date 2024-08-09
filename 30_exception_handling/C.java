import java.io.FileReader;
import java.io.FileNotFoundException;

//handling checked exception using throws exception

public class C {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(1);

        FileReader fr = new FileReader("abc.txt");

        System.out.println(2);

    }
}
//this will give no compilation error but gives FileNotFoundException because abc.txt doesn't exist 

//output

// 1
// Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at C.main(C.java:11)
