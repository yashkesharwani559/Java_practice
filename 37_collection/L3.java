import java.util.ArrayList;
import java.util.Collections;

class L3 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        //not using it typesafely

        arr.add(12);
        arr.add(197);
        arr.add("ganesh");
        arr.add("ramesh");
        arr.add("suresh");
        arr.add("mahesh");
        arr.add("vikrant");
        arr.add("rahul");

        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr);

    }
}
//here exception is because sort() method throws these unchecked exception
// ClassCastException - if the list contains elements that are not mutually comparable (for example, strings and integers).
// UnsupportedOperationException - if the specified list's list-iterator does not support the set operation.
// IllegalArgumentException - (optional) if the implementation detects that the natural ordering of the list elements is found to violate the Comparable contract

//output
// [12, 197, ganesh, ramesh, suresh, mahesh, vikrant, rahul]
// Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//         at java.base/java.lang.String.compareTo(String.java:125)
//         at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:325)
//         at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//         at java.base/java.util.Arrays.sort(Arrays.java:1315)
//         at java.base/java.util.Arrays.sort(Arrays.java:1509)
//         at java.base/java.util.ArrayList.sort(ArrayList.java:1750)
//         at java.base/java.util.Collections.sort(Collections.java:145)
//         at L3.main(L3.java:20)