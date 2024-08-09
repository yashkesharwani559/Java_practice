import java.io.FileNotFoundException;

public class Q2 {
    public static void main(String[] args)throws FileNotFoundException{
        int x = 12/0;
    }
}
//legal code
//no compilation error but gives runtime exception as ArithmeticException

//so if a method generates an unchecked exception then also we can write throwing a checked exception from it