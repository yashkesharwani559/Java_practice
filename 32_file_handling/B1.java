import java.io.File;

public class B1 {
    
    public static void main(String[] args) {

        System.out.println(1);

        File f = new File("abc1.txt");

        System.out.println(f.exists());//true  //because file exist
        
        System.out.println(2);

    }

}

//output
// 1
// true
// 2
