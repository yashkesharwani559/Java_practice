public class G {
    static{
        System.out.println("static");
    }
    
    G(){
        
        System.out.println("constructor");
    }

    public static void main(String[] argas){
        G x = new G();
        G x1 = new G();
        G x2 = new G();
    }
}

//this will give output as
// static
// constructor
// constructor
// constructor
