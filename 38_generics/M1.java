import java.util.ArrayList;
 
public class M1 {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(54);
        l1.add(79);

        ArrayList<Float> l2 = new ArrayList<>();
        l2.add(12.45f);
        l2.add(2.45f);
        l2.add(1.5f);

        System.out.println(l1);
        System.out.println(l2);

        average(l1);
        average(l2);

    }

    static void process(ArrayList<? extends Number> y) {

        System.out.println(y);
    }

    static void average(ArrayList<? extends Number> x) {
        
        if (x.get(0) instanceof Integer) {
            int sum = 0;
            for (int i = 0; i < x.size(); i++) {
                sum += (Integer) x.get(i);
            }
            System.out.println(sum / x.size());
            
        }else if (x.get(0) instanceof Float) {
            float sum = 0;
            for (int i = 0; i < x.size(); i++) {
                sum += (Float) x.get(i);
            }
            System.out.println(sum / x.size());
        
        }
    }
}
//output
// [12, 54, 79]
// [12.45, 2.45, 1.5]
// 48
// 5.4666667