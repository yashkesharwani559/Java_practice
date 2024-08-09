import java.io.FileWriter;
import java.io.IOException;

public class B2 {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("mno.txt");

            fw.write("amit is a good boy");
            
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//here we are using the instance method write(String c) -> method that is a method in FileWriter class that writes one whole String at a time