import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class B {
    public static void main(String[] args){
        
        File f = new File("abc.txt");
        try{
            FileReader fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            System.out.println("FNFE");
        }
    }
}

//output
// FNFE 

//because file abc.txt is not present in same folder