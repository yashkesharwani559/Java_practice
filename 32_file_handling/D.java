import java.io.File;

public class D {
    public static void main(String[] args) {

        File f = new File("abc.txt");

        System.out.println(f.isFile());//false  //because abc.txt doesnot exists

        File f1 = new File("abc1.txt");

        System.out.println(f1.isFile());//true  // because abc1.txt is a file not a directory

        File f2 = new File("hii");

        System.out.println(f2.isFile());//false //because hii is a folder/directory and not a file

    }
}

//public boolean isFile() --> this is an instance method which checks that the pathname exists or not and also the given pathname is a normal file or not
//but it throws SecurityException when there is not required permissions there on the file/folder

// output
// false
// true
// false 