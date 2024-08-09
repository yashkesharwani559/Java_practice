import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D {
    public static void main(String[] args){
        //program to read the whole contents from file and then print it in the console
        
        Object o = 23;//correct
        
        try{
            FileReader fr = new FileReader("abc1.txt");

            int ch = fr.read();
            do{
                System.out.print((char)ch);
                ch = fr.read();
            }while(ch != -1);

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