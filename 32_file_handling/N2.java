import java.io.File;

public class N2 {
    public static void main(String[] args) {
        
        File f = new File("del");

        System.out.println(f.delete());//false
        //because the del folder is not empty and delete() method doesnot deletes the directory if it contains any folders and directory.
        
    }
}
