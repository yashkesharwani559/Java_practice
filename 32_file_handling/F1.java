import java.io.File;

public class F1 {
    public static void main(String[] args) {
        
        File f = new File("D:\\New folder\\YASH\\ingole sir\\Core Java\\32_file_handling\\abc1.txt");
        
        File f2 = new File("D:\\New folder\\YASH\\ingole sir\\Core Java\\32_file_handling\\abc1.txt");
        
        File f1 = f.getAbsoluteFile();

        System.out.println(f);
        System.out.println(f1);
        
        System.out.println(f == f1);//false
        System.out.println(f == f2);//false        
        
        //so this means that everytime we create two or more objects of File class having same pathname, all objects are different means they all have different objects in it

        // and also when the File class object already contains an absolute path and we call getAbsoluteFile() method, then it creates a new File class object with same pathname but a new object is created.

        // So we can say that for the File class, everytime a new object is created for a pathname irrespective that the pathname are same or not. and we can say that there is no concept of pooling for the objects of File class
 
    }
}
//output
// D:\New folder\YASH\ingole sir\Core Java\32_file_handling\abc1.txt
// D:\New folder\YASH\ingole sir\Core Java\32_file_handling\abc1.txt
// false