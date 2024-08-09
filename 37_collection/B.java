import java.util.TreeSet;
 
public class B {
    public static void main(String[] args)  {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(23);
        set.add(56);
        set.add(86);
        set.add(79);
        set.add(37);
        set.add(48);

        System.out.println(set);
        System.out.println(set.first());// 23
        System.out.println(set.last());// 86
        
    }
}

// first() -> is an instance method in the TreeSet class that returns the lowest value from all the values that are stored in the TreeSet.

// last() -> is an instance method in the TreeSet class that returns the largest value(element) from all the values(elements) that are stored in the TreeSet.