import java.io.File;

public class H1 {
    public static void main(String[] args) {

        File f = new File("z1/z2/no1");// no folder doesnot exist

        System.out.println(f.exists());//false
        
        System.out.println(f.mkdir());//false //here it is giving false because its folder hierarchy doesn't exists
        
        System.out.println(f.exists());//false
    }
}