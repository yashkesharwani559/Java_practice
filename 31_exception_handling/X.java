import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class X {
    public static void main(String[] args){
        System.out.println(1);
        try{
            System.out.println(2);
            FileReader fr = new FileReader("abc2.txt");
            System.out.println(3);
            fr.close();//close() is an instance method in class FileReader class that throws IOException
            //using close() method is a good practice because this deallocates/fee up the resources engaged in it
             
         } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//output
// 1
// 2
// 3
