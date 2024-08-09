import java.io.File;

public class I1 {
    public static void main(String[] args){
        File f = new File("no3");

        System.out.println(f.exists());//false

        System.out.println(f.mkdirs());//true 

        System.out.println(f.exists());//true
    }
}

//so mkdirs() method creates the folder directly also and no folder hierarchy is must.