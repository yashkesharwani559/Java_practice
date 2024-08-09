import java.io.FileNotFoundException;
import java.io.IOException;

public class O2 {
    void pro() throws IOException{
        System.out.println("O");
    }
}

class XX3 extends O2 {
    void pro() throws FileNotFoundException {
        System.out.println("XX1");
    }
}
//correct code

//so overridden method can throw same or child class exception or no exception 
// but it cannot throw a new excpetion 