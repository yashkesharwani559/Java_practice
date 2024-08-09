import java.util.Iterator;
import java.util.TreeSet;
import java.util.SortedSet;
 
public class X2 {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add(12);
        ts.add(92);
        ts.add(32);
        ts.add(72);
        ts.add(79);
        ts.add(89);

        System.out.println(ts);

        Iterator iterator = ts.descendingIterator();//descendingIterator() is an instance method that returns an iterator to traverse the elements of the TreeSet in the descending/reverse order.

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
//output
// [12, 32, 72, 79, 89, 92]
// 92
// 89
// 79
// 72
// 32
// 12