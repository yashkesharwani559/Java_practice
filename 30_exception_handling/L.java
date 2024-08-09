import java.io.FileNotFoundException;

public class L {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("no exception");
    }
}

//so a method can throw a checked exception even when the method didnot generates it but a method must handle(throw or by try-catch) the checked exception when it is generated