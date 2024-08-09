import java.io.File;

public class K1 {
    public static void main(String[] args) {
        
        File file = new File("mohan.txt");

        System.out.println(file.exists());//true

        File f = new File("x1/y1/z1");

        System.out.println(f.mkdirs());//true

        System.out.println(f.exists());//true
        
        File fold = new File("x1/y1/hello.txt");

        System.out.println(fold.exists());//false

        System.out.println(file.renameTo(fold));//true

        System.out.println(file.exists());//false

        System.out.println(fold.exists());//true

        
    }
}
//so renameTo(File) method can also be used to move the file from anywhere to anywhere.
