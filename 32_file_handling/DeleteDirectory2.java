import java.io.File;
 
//a short version program that is used to delete any type of directories and files in java 
public class DeleteDirectory2 {
    public static void main(String[] args) {
        File f = new File("abc");
        delete(f);
        System.out.println("File deleted");
    }

    public static void delete(File f) {
        if(f.isDirectory()){
            for (String s : f.list()) {
                File f1 = new File(f, s);
                delete(f1);
            }
        }
        
        f.delete();
    }
}
