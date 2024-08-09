import java.io.FileReader;
import java.io.FileNotFoundException;
 
public  class I {
    I(){
        FileReader fr = new FileReader("abc.txt");//compilation error here
    }
    public static void main(String[] args){
        I x = new I();
    }
}
//compilation error as
// I.java:6: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error
// error: compilation failed