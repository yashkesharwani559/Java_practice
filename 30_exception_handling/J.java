import java.io.FileReader;
import java.io.FileNotFoundException;
 
public  class J {
    J() {
        try{
            FileReader fr = new FileReader("abc.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("solve");
        }
    }
    public static void main(String[] args){
        J x = new J();
    }
}

//output after solution

//solve