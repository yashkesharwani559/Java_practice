import java.io.File;

public class O1 {
    public static void main(String[] args) {
        // String s = null;
        // File f = new File(s, "abc1.txt");

        // System.out.println(f);//abc1.txt
        // System.out.println(f.exists());//true
        //so if we pass null to the parent String argument then the child is considered as in the same folder and it will work like the File(String) parameterized constructor

        File s = null;
        File f = new File(s, "abc1.txt");

        System.out.println(f);//abc1.txt
        System.out.println(f.exists());//true
        //so if we pass null to the parent File argument then the child is considered as in the same folder and it will work like the File(String) parameterized constructor

    }
}
