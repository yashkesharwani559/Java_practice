import java.io.FileReader;

public class A2 {
    public static void main(String[] args){
        FileReader fr = new FileReader("abc.txt");
    }
}

//because FileReader() constructor throws FileNotFoundException which is a checked exception so we have to manage it

// compilation error as 
// A2.java:5: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error
// error: compilation failed