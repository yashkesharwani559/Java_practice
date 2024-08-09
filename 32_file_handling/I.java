import java.io.File;

public class I {
    public static void main(String[] args) {

        File f = new File("z12/z2/no2");// no folder doesnot exist

        System.out.println(f.exists());//false

        System.out.println(f.mkdirs());//true

        System.out.println(f.exists());//true

    }
}

//public boolean mkdirs() --> public instance method, used to create the directory with the name same as the pathname and with their folder hierarchy if it doesnot exist.
// it returns true when the folder/directory and its hierarchy doesnot exists and create that folder and otherwise returns false if it already exists
//throws SecurityException due to security reasons because of SecurityManager class