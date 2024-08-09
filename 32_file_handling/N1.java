import java.io.File;

public class N1 {
    public static void main(String[] args){
        File f = new File("delete2.txt");

        System.out.println(f.delete());//false 
        //because delete2.txt doesn't exist

    }
}
