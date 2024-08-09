import java.io.FileWriter;
import java.io.IOException;

public class B {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("mno.txt");

            fw.write('a');
            fw.write('m');
            fw.write('i');
            fw.write('t');
            // we should know that if we are using write then it is being written in the buffer and we should call flush() to write it into the file. We can also directly call close() because it also internally calls the flush() first

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
