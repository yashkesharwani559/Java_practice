import java.io.FileNotFoundException;

public class N {
    public static void main(String[] args) {
        try {
            int a = 12 / 0;
        } catch (FileNotFoundException e) {
            System.out.println("solve");
        }
    }
}

//compilation error

// output
// N.java:7: error: exception FileNotFoundException is never thrown in body of corresponding try statement
//         }catch(FileNotFoundException e){
//          ^
// 1 error
// error: compilation failed