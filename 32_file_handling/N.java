import java.io.File;
 
public class N {
    public static void main(String[] args){
        File f = new File("delete.txt");

        System.out.println(f.exists());//true

        System.out.println(f.delete());//true

        System.out.println(f.exists());//false

    }
}
//public boolean delete() --> is an instance method that is used to delete the pathname(file).
// If a pathname denotes a directory, then it must be empty to in order to be deleted successfully
// it returns true if and only if the file is successfully deleted and otherwise returns false
// Throws SecurityException - If a security manager exists and its SecurityManager.checkDelete(java.lang.String) method denies delete access to the file