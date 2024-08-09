import java.io.FileReader;
import java.io.FileNotFoundException;
 
public  class I1 {
    I1() throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
    }
    public static void main(String[] args){
        I1 x = new I1();//compilation error here
    }
}

// I1.java:9: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         I1 x = new I1();//compilation error here
//                ^
// 1 error
// error: compilation failed