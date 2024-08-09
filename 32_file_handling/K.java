import java.io.File;
import java.io.IOException;

public class K {
    public static void main(String[] args) {

        File file = new File("mohan.txt");

        System.out.println(file.exists());//false

        try {
            System.out.println(file.createNewFile());//true
        } catch (IOException e) {
            System.out.println("solved");
        }

        System.out.println(file.exists());//true

    }
}
