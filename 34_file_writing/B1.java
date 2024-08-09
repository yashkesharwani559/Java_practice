import java.io.FileWriter;
import java.io.IOException;

public class B1 {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("mno.txt");

            fw.write('a');
            fw.write('m');
            fw.write('i');
            fw.write('t');
            // we should know that if we are using write() then it is being written in the buffer and we should call flush() to write it into the file. We can also directly call close() because it also internally calls the flush() first
            // but the main aim to use close() is to free up the resources allocated to it

            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//here we are using the instance method write(char c) -> method that is a method in FileWriter class that writes one character at a time