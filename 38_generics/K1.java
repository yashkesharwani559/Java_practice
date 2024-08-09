import java.util.ArrayList;
 
public class K1 {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(54);
        l1.add(79);

        ArrayList<Float> l2 = new ArrayList<>();
        l2.add(12.45f);
        l2.add(2.45f);
        l2.add(1.5f);

        process(l1);
        process(l2);

        System.out.println(l1);
        System.out.println(l2);

    }

    static void process(ArrayList<Integer> x) {
        System.out.println(x);
    }
    
    static void process(ArrayList<Float> y) {
        System.out.println(y);
    }
}
//compilation error because here it is not a successful method overloading, this is because typesafety only gives the compile time safety and before runtime the typesafety is erased by the type eraser of the compiler and at runtime both methods will seem to be same