import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class R {
    
}

class XX8{
    void pro() throws IOException{

    }
}

class YY8 extends XX8{
    void pro()throws FileNotFoundException, EOFException{

    }
}
//correct code
//because overridden method can throw the child exceptions of the exception that is thrown in the overridden method of the parent class