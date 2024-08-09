import java.io.FileReader;
import java.io.FileNotFoundException;

public class H4 {

    public static void main(String[] args) throws FileNotFoundException{

        System.out.println("A");
        abc();
        System.out.println("A1");

    }

    static void abc() throws FileNotFoundException{
        System.out.println("B");
        mno();
        System.out.println("B1");
    }

    static void mno() throws FileNotFoundException {
        System.out.println("C");
        pqr();
        System.out.println("C1");
    }

    static void pqr() throws FileNotFoundException {
        System.out.println("D");
        FileReader fr = new FileReader("abc.txt");//here the program gives the FileNotFoundexception and program crashes
        
        System.out.println("D");
    }
}

//no compilation error here because here main is throwing the FileNotFoundException but at runtime it will give output as

//output

// B
// C
// D
// Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at H4.pqr(H4.java:28)
//         at H4.mno(H4.java:22)
//         at H4.abc(H4.java:16)
//         at H4.main(H4.java:9)
