import java.util.TreeSet;
import java.util.SortedSet;
import java.util.HashSet;

public class C {
    public static void main(String[] args) {
        
        TreeSet set = new TreeSet();

        set.add(24);        
        set.add(4);
        set.add(2);
        set.add(76);
        set.add(74);
        set.add(87);
        set.add(96);

        System.out.println(set);

        // SortedSet s = set.headSet(45);
        // System.out.println(s);//[2, 4, 24]

        // SortedSet s1 = set.headSet(95);
        // System.out.println(s1);//[2, 4, 24, 74, 76, 87]

        // SortedSet s2 = set.headSet(1);
        // System.out.println(s2);//[]  -> returns an empty array if no element is less than the given element

        // TreeSet s3 = set.headSet(45);//compilation fail
        TreeSet s3 = (TreeSet) set.headSet(45);//correct
        System.out.println(s3);//[2, 4, 24]

        TreeSet s4 = (TreeSet) set.headSet(24);
        System.out.println(s4);//[2, 4]
        
    }
}
// headSet(E toElement) -> it is an instance method in the TreeSet class that takes the type of element E as argument and returns a SortedSet<E> means any subclass of it which contains those elements that are strictly less than the toElement(passed in argument).
// and will return an empty array if there is no vaue in the Set that is less than the given value