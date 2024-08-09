import java.io.FileReader;
import java.io.FileNotFoundException;
 
public  class I2 {
    I2() throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
    }
    public static void main(String[] args) throws FileNotFoundException{
        I2 x = new I2();
    }
}
//no compilation error but gives FileNotFoundException

//output

// Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at I2.<init>(I2.java:6)
//         at I2.main(I2.java:9)