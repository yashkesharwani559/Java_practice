import java.io.FileWriter;
import java.io.IOException;

public class G1 {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("fgh.txt");//here writing on the same file again

            fw.write("how are you");
            // sohanganesh -> old
            // how are you -> new
            
            // means the old value is overridden by the new value

            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
