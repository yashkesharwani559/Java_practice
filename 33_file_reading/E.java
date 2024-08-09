import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E {
    public static void main(String[] args) {
        //program to read the whole contents from file and then print it in the console

        try {
            FileReader fr = new FileReader("abc1.txt");

            char ch[] = new char[10];
            while ((fr.read(ch)) != -1) {
                for (char c : ch) {
                    System.out.print(c);
                }
            }

            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

//output
// How are you?
// What I can do?