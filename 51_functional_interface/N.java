import java.util.ArrayList;
import java.util.Collection;

public class N {
    public static void main(String[] args) {

        // ArrayList<Integer> arr = new ArrayList<>();
        Collection<Integer> arr = new ArrayList<>();

        arr.add(23);
        arr.add(76);
        arr.add(80);
        arr.add(82);
        arr.add(17);

        arr.forEach(next -> System.out.println(next + ", "));

    }
}

// default void forEach(functional interface) -> a default instance method defined in the Iterable interface present in java.lang package.
// this method takes one parameterized functional interface as input and preforms all the actions written inside the functional interface. And here the functional interface code runs for each element of that iterable.
// Collection is an interface in java.util package, which extends the Iterable interface. So the Collection interface has forEach() method of the Iterable interface. And since Collection is the parent of Set, List, and Queue interface, that's why all the subclasses and subinterfaces of the Set, List, and Queue have the forEach() method in it.

//output
// 23,
// 76,
// 80,
// 82,
// 17,