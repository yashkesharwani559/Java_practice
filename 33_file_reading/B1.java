import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class B1 {
    public static void main(String[] args){
        
        File f = new File("abc1.txt");
        try{
            FileReader fr = new FileReader(f);
            System.out.println("File Created");
        } catch (FileNotFoundException e) {
            System.out.println("FNFE");
        }
    }
}

//output
// File Created

//because file abc.txt is not present in same folder