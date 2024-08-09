import java.io.File; 
 
class E{
    public static void main(String[] args){
        
        File f = new File("abc1.txt");

        System.out.println(f);//prints the relative path in the form of String

        String s = f.getAbsolutePath();//returns and stores the absolute path of the file/folder in the form of String

        System.out.println(s);//prints the absolute path

    }
}

//public String getAbsolutePath() --> it is a public instance method that returns the absolute pathname of the file/directory in the form of String.
//but it throws SecurityException - If a required system property value cannot be accessed.

//output
// abc.txt
// D:\New folder\YASH\ingole sir\Core Java\32_file_handling\abc1.txt