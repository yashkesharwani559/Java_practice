import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class E3 {
    public static void main(String[] args) {
        
        try{
            PrintWriter pr = new PrintWriter("xz.txt");
   
            pr.println("hello timepass");
            pr.println("hello timepass");

            pr.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
