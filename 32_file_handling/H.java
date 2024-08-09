import java.io.File;

public class H {
    public static void main(String[] args) {

        File f = new File("no");// no folder doesnot exist

        System.out.println(f.exists());//false
        
        System.out.println(f.mkdir());//true
        
        System.out.println(f.exists());//true
    }
}

//public boolean mkdir() --> public instance method, used to create the directory with the name same as the pathname.
// it returns true when the folder/directory doesnot exists and create that folder and otherwise returns false if it already exists
//throws SecurityException due to security reasons because of SecurityManager class