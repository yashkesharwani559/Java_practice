import java.io.File;

public class L1 {
    public static void main(String[] args){
        
        File f = new File("no5");
        
        System.out.println(f.exists());//false

        File f1 = new File("pro1");

        System.out.println(f.renameTo(f1));//false

        System.out.println(f.exists());//false
        
        System.out.println(f1.exists());//false
    }
}
//so if the directory doesn't exists then the renameTo() method returns false
