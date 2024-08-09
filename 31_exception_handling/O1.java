import java.io.IOException;

public class O1 {
    void pro() throws IOException{
        System.out.println("O");
    }
}

class XX2 extends O1{
    void pro() throws IOException{
        System.out.println("XX1");
    }
}
//correct code
//so we can write same class throw statement in the overridden method in the child class