import java.io.FileWriter;
import java.io.IOException;

public class G {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("fgh.txt");

            fw.write("sohan");
            fw.write("ganesh");
            // sohanganesh

            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
