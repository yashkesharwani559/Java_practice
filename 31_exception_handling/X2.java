import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class X2 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            System.out.println(1);
            fr = new FileReader("abc2.txt");
            System.out.println(2);
        }catch(FileNotFoundException e){
            System.out.println("FNFE");
        }finally{
            try{
                fr.close();
            }catch(IOException e){
                System.out.println("IOE");
            }
        }
    }
}
///output
// 1
// 2