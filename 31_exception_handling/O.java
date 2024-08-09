import java.io.IOException;

public class O {
    void pro() throws IOException{
        System.out.println("O");
    }
}

class XX1 extends O{
    void pro(){
        System.out.println("XX1");
    }
}
//legal code
//so if parent class method has thrown some exception then its not necessary for the child class to throw the exception in the overridden method