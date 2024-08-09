import java.util.ArrayList;

public class O {
    public static void main(String[] args) {
        
        ArrayList<AA> l1 = new ArrayList<>();
        ArrayList<BB> l2 = new ArrayList<>();
        ArrayList<CC> l3 = new ArrayList<>();
        ArrayList<DD> l4 = new ArrayList<>();
        ArrayList<DD.EE> l5 = new ArrayList<>();
        ArrayList<int[]> l6 = new ArrayList<>();
        //all above are correct

        // so in ArrayList we cannot pass primitives in typesafety. and other than this you can pass array(both of primitives and class), class, interface, enum, inner class, abstract class

        
        
        // Days day = 12;//compilation fail
        // enum is a class type you can say where we define the predifined value that can be stored in the enum variable
    }
}

class AA{}
abstract class BB{}
interface CC{}
enum Days{Monday, tuesday, wednesday, thrusday};
class DD{
    class EE{}
}