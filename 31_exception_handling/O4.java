import java.io.EOFException;
import java.io.FileNotFoundException;

public class O4 {
    void pro() throws FileNotFoundException{
        System.out.println("O");
    }
}

class XX5 extends O4 {
    void pro() throws EOFException {
        System.out.println("XX1");
    }
}
//compilation error
// because overridden method cannot throw any new exception or sibling exception 

