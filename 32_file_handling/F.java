import java.io.File; 
 
class F{
    public static void main(String[] args){
        
        File f = new File("abc1.txt");

        File s = f.getAbsoluteFile();//returns and stores the absolute path of the file/folder in the form of File class object

        System.out.println(s);//prints the absolute path

        System.out.println(s == f);//false
        //because new object is created for the File object to store the absolute path

    }
}

//public String getAbsoluteFile() --> it is a public instance method that returns the absolute pathname of the file/directory in the form of File class object.
//but it throws SecurityException - If a required system property value cannot be accessed.

// output
// D:\New folder\YASH\ingole sir\Core Java\32_file_handling\abc1.txt