import java.io.FileNotFoundException;
import java.io.FileReader;

public class X1 {
    public static void main(String[] args) {

        try {
            System.out.println(1);
            FileReader fr = new FileReader("abc2.txt");
            System.out.println(2);
        }catch(FileNotFoundException e){
            System.out.println("FNFE");
        }finally{
            fr.close();//compilation error as fr is not defined
        }
    }
}

// X1.java:14: error: cannot find symbol
//             fr.close();//compilation error as fr is not defined
//             ^
//   symbol:   variable fr
//   location: class X1
// 1 error
// error: compilation failed