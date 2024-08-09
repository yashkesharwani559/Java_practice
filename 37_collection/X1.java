import java.util.TreeSet;
import java.util.SortedSet;
 
public class X1 {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add(12);
        ts.add(92);
        ts.add(32);
        ts.add(72);
        ts.add(79);
        ts.add(89);

        System.out.println(ts);

        SortedSet ts1 = ts.descendingSet();//an instance method declared in the NavigableSet that returns a SortedSet where the elements are arranged in the descending order

        System.out.println(ts1);
        
    }
}
//output
// [12, 32, 72, 79, 89, 92]
// [92, 89, 79, 72, 32, 12]