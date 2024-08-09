import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C {
    public static void main(String[] args){
        //program to read from file and then print it in the console
        
        try{
            FileReader fr = new FileReader("abc1.txt");

            int ch = fr.read();
            System.out.println((char) ch);

            ch = fr.read();
            System.out.println((char)ch);

            fr.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

//output
// H
// o