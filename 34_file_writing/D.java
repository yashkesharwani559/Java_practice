import java.io.*;

public class D {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("ayz.txt");

        fw.write("hello how are you \n I am fine");//here \n will not generate a line gap

        fw.close();
    }
}
