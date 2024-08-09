import java.io.File;

public class L {
    public static void main(String[] args){
        File f = new File("no");
        System.out.println(f.exists());//true

        File f1 = new File("pro");

        System.out.println(f.renameTo(f1));//true

        System.out.println(f.exists());//false
        
        System.out.println(f1.exists());//true
    }
}
