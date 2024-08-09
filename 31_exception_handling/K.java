import java.io.IOException;

public class K {
    public static void main(String[] args){
        try{

        }catch(IOException e){
            System.out.println("solution");
        }
    }
}
//compilation error because IOException is a type of checked exception and catch block for checked exception can be written only when its try block throws that checked exception

// K.java:7: error: exception IOException is never thrown in body of corresponding try statement
//         }catch(IOException e){
//          ^
// 1 error
// error: compilation failed