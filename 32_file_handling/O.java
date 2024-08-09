import java.io.File;

public class O {
    public static void main(String[] args) {
        // File f = new File("D:/New folder/YASH/ingole sir/Core Java/32_file_handling/abc1.txt");//using (String) parameterized constructor

        // File f = new File("D:/New folder/YASH/ingole sir/Core Java/32_file_handlin g","abc1.txt");//same as above //using (String,String) parameterized constructor

        File f1 = new File("D:/New folder/YASH/ingole sir/Core Java/32_file_handling");
        File f = new File(f1, "abc1.txt");//same as above //using (File,String) parameterized constructor
                
        System.out.println(f.exists());//true
    }
}
//constructors in the File class:-
// 1. public File(String pathname) --> this is the constructor that takes String pathname as the argument and then creates the object of File class. It throws the NullPointerException when the pathname argument is passed as null.


// 2. public File(String parent, String child) --> this is the constrtuctor that takes two String arguments first is parent pathname and second is the child pathname
// Creates a new File instance from a parent pathname string and a child pathname string.
// If parent is null then the new File instance is created as if by invoking the single-argument File constructor on the given child pathname string.
// Otherwise the parent pathname string is taken to denote a directory, and the child pathname string is taken to denote either a directory or a file. If the child pathname string is absolute then it is converted into a relative pathname in a system-dependent way. If parent is the empty string then the new File instance is created by converting child into an abstract pathname and resolving the result against a system-dependent default directory. Otherwise each pathname string is converted into an abstract pathname and the child abstract pathname is resolved against the parent.
//throws NullPointerException - If child is null


//3. public File(File parent, String child) --> this is the constructor that is two argument parameterized first is the File class object that contains the parent pathname and second a String argument that takes child pathname as argument. 
// Creates a new File instance from a parent abstract pathname and a child pathname string.
// If parent is null then the new File instance is created as if by invoking the single-argument File constructor on the given child pathname string.
// Otherwise the parent abstract pathname is taken to denote a directory, and the child pathname string is taken to denote either a directory or a file. If the child pathname string is absolute then it is converted into a relative pathname in a system-dependent way. If parent is the empty abstract pathname then the new File instance is created by converting child into an abstract pathname and resolving the result against a system-dependent default directory. Otherwise each pathname string is converted into an abstract pathname and the child abstract pathname is resolved against the parent.
// throws NullPointerException - If child is null