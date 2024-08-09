import java.io.File;

public class C {
    public static void main(String[] args){
        
        File f = new File("abc.txt");

        System.out.println(f.isDirectory());//false  //because abc.txt doesnot exists

        File f1 = new File("abc1.txt");

        System.out.println(f1.isDirectory());//false  // because abc1.txt is a file not a directory
        
        File f2 = new File("hii");

        System.out.println(f2.isDirectory());//true

    }
}

//public boolean isDirectory()  --> checks that the given pathname is a directory or not
//returns true if and only if the pathname exists and the pathname is a directory
//throws SecurityException when security/permission issue arises

// output
// false
// false 
// true