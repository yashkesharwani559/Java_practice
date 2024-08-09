import java.io.File;
 
public class Q {
    public static void main(String[] args){

        File f = new File("mohan.txt");

        System.out.println(f.exists());//false
        //because the real file name is mohan.txt.txt

        File f1 = new File("mohan.txt.txt");

        System.out.println(f1.exists());//true

    }
}
