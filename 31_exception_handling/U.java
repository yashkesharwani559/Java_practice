import java.io.IOException;

public class U {
    void pro() throws IOException{

    }
}

class YY10 extends U{
    void pro() throws IndexOutOfBoundsException{
        
    }
}
//legal code
//because if the overriding parent class method throws a checked exception and its child overridden method generates a new unchecked exception then the unchecked exception is ignored in java and the code compiles with no compilation error