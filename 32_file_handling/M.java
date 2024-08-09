import java.io.File;
import java.io.IOException;

public class M {
    public static void main(String[] args) {

        File f = new File("z1");

        String[] str = f.list();

        System.out.println("content in the folder z1:");
        for (String s : str) {
            System.out.println(s);
        }

    }
}

// public String[] list() --> is an instance method that returns the array of Strings. Basically, in the array of Strings it returns all the files and directories that are there in that pathname(directory).
// It returns An array of strings naming the files and directories in the directory denoted by this abstract pathname. The array will be empty if the directory is empty. Returns null if this abstract pathname does not denote a directory, or if an I/O error occurs.

// Throws SecurityException - If a security manager exists and its SecurityManager.checkRead(String) method denies read access to the directory