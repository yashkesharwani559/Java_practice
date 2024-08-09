import java.io.File;

public class A1 {
    
    public static void main(String[] args) {

        System.out.println(1);

        File f = new File("abc.txt");//this is a relative path
        //this file doesn't exist
        //if we give the relative path then the java assumes the file/folder in the same folder
        //since the abc.txt doesnot exist but the code runs without any error and also it doesn't create the file (abc.txt)
        
        
        System.out.println(2);

    }

}

//output
// 1
// 2