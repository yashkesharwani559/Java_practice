import java.io.*;
 
public class D1 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("ayz.txt"));

        bw.write("hello, how are you?");

        bw.newLine();//newLine() -> generates a new line between to write() contents

        bw.write("I am fine");

        bw.close();
    }
}
