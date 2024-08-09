import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D1 {
    public static void main(String[] args){
        //program to read the whole contents from file and then print it in the console
        
        try{
            FileReader fr = new FileReader("abc1.txt");

            int ch;
            while((ch = fr.read()) != -1){
                System.out.print((char)ch);
            }

            fr.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

//output
// How are you?
// What I can do?