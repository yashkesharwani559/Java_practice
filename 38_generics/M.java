import java.util.ArrayList;
 
public class M {
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

        System.out.println(y.size());
        System.out.println(y.isEmpty());
        System.out.println(y.remove(0));
        //all above will give no compilation error

        // y.add(12);//compilation fail
        // y.set(0, 1);//compilation fail

    }
}