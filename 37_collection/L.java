import java.util.ArrayList;
import java.util.Collections;

class L {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(92);
        arr.add(2);
        arr.add(26);
        arr.add(76);
        arr.add(716);

        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr);

    }
}
//output
// [12, 92, 2, 26, 76, 716]
// [2, 12, 26, 76, 92, 716]


// Collections is in java.util package;
// Collections is a class in java that comes under collection framework.
// in Collections class, there is no constructor (means you can say that constructors are actually private)

//static <T extends Comparable<? super T>> void sort(List<T>) -> it is a static method in the Collections class that takes any List or its subclass as argument and returns nothing but it rearranges the records in ascending order in the same List.
// generate unchecked exception that are:
// ClassCastException - if the list contains elements that are not mutually comparable (for example, strings and integers).
// UnsupportedOperationException - if the specified list's list-iterator does not support the set operation.
// IllegalArgumentException - (optional) if the implementation detects that the natural ordering of the list elements is found to violate the Comparable contract