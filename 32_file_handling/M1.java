import java.io.File;
 
public class M1 {
    public static void main(String[] args){
        File f = new File("abc1.txt");

        System.out.println(f.list());//null
    }
}
//if the pathname is a file then it returns null;
