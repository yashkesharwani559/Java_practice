import java.io.FileReader;
import java.io.FileNotFoundException;

public class E {
    E(){ 
        FileReader fr = new FileReader("abc.txt");
    }
}

//here it will give compilation error because FileReader(String) constructor gives FileNotFoundException which is a checked exception

//compilation error
// E.java:6: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error
// error: compilation failed