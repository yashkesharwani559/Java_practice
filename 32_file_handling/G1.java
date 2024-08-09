import java.io.File;
import java.io.IOException;

public class G1 {
    public static void main(String[] args){
        
        File file = new File("abc1.txt");//abc1.txt already exists

        System.out.println(file.exists());//true

        try{
            System.out.println(file.createNewFile());//false
        } catch (IOException e) {
            System.out.println("File is already there");
        }
        
        System.out.println(file.exists());//true

    }
}

//output
// true
// false
// true