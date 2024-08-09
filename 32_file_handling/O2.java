import java.io.File;

public class O2 {
    public static void main(String[] args) {
        String s = "D:/New folder/YASH/ingole sir/Core Java/32_file_handling";
        File f = new File(s, "abc1.txt");

        System.out.println(f);//abc1.txt
        System.out.println(f.exists());//true

        //same as above
        // File s = new File("D:/New folder/YASH/ingole sir/Core Java/32_file_handling");
        // File f = new File(s, "abc1.txt");

        // System.out.println(f);//abc1.txt
        // System.out.println(f.exists());//true

    }
}

//output
// D:\New folder\YASH\ingole sir\Core Java\32_file_handling\abc1.txt
// true