import java.io.File;

public class B {
    
    public static void main(String[] args) {

        System.out.println(1);

        File f = new File("abc.txt");

        System.out.println(f.exists());//false  //because file/folder doesn't exist
        
        System.out.println(2);

    }

}
// public boolean exists() --> this is an instance method that returns true if file/folder exists and otherwise returns false
//but it throws a SecurityException (an unchecked exception in java.lang package) when any security problem arises

//output
// 1
// false
// 2