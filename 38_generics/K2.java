import java.util.ArrayList;
 
public class K2 {
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

    static void process(ArrayList<? extends Number> y) {
        System.out.println(y);
    }//this is correct way so that we can pass any ArrayList that has typesafety of Number interface and subclasses of the Number

}
//output
// [12, 54, 79]
// [12.45, 2.45, 1.5]
// [12, 54, 79]
// [12.45, 2.45, 1.5]