import java.util.ArrayList;
import java.util.Comparator;

class M {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(92);
        arr.add(2);
        arr.add(26);
        arr.add(76);
        arr.add(716);

        System.out.println(arr);

        arr.sort(new NumSort());

        System.out.println(arr);

    }
}
//output
// [12, 92, 2, 26, 76, 716]
// [2, 12, 26, 76, 92, 716]

class NumSort implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        return i1 - i2;
    }
}

//List<E>
//default void sort(Comparable<? super E>) -> sort is a default method that is defined in the List interface which takes the same typesafe comparator subclass object. Here for predefined class List also we have to pass a Comparator object as argument 
// that is the difference with the sort() method of the Collections Interface that takes only the List object as the argument