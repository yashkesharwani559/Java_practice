import java.io.Serializable;
import java.util.ArrayList;
 
public class L3 {
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
    
    static void process(ArrayList<? extends Serializable> y) {
        System.out.println(y);
    }
}
//compilation error
// L3.java:29: error: name clash: process(ArrayList<? extends Serializable>) and process(ArrayList<Integer>) have the same erasure
//     static void process(ArrayList<? extends Serializable> y) {
//                 ^
// 1 error
// error: compilation failed