import java.io.File;
import java.io.IOException;

public class J {
    public static void main(String[] args) {
        
        File f = new File("abc4.txt");

        try{
            f.createNewFile();
        }catch(IOException e){
            System.out.println("solved");
        }

        System.out.println(f);

        System.out.println(f.exists());

    }
}
//this creates a new file called abc4.txt