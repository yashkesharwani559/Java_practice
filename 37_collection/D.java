import java.util.TreeSet;
import java.util.SortedSet;

public class D {
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

        // SortedSet s = set.tailSet(45);
        // System.out.println(s);//[74, 76, 87, 96]

        // SortedSet s1 = set.tailSet(4);
        // System.out.println(s1);//[4, 24, 74, 76, 87, 96]

        // SortedSet s5 = set.tailSet(96);
        // System.out.println(s5);//[96]

        // SortedSet s2 = set.tailSet(97);
        // System.out.println(s2);//[]  -> returns an empty array if no element is less than the given element

        // TreeSet s3 = set.tailSet(45);//compilation fail
        // TreeSet s3 = (TreeSet) set.tailSet(45);//correct
        // System.out.println(s3);//[74, 76, 87, 96]
        
        // TreeSet s4 = (TreeSet)set.tailSet(74);
        // System.out.println(s4);//[74, 76, 87, 96]

    }
}
// tailSet(E toElement) -> it is an instance method in the TreeSet class that takes the type of element E as argument and returns a SortedSet<E> means any subclass of it which contains those elements that are than greater than or equal to the toElement(passed in argument).
// and will return an empty array if there is no vaue in the Set that is less than the given value