import java.io.File;

public class L2 {
    public static void main(String[] args){
        
        File f = new File("no3");
        
        System.out.println(f.exists());//true

        File f1 = new File("pro");

        System.out.println(f.renameTo(f1));//false

        System.out.println(f.exists());//true
        
        System.out.println(f1.exists());//true
    }
}