import java.util.ArrayList;
import java.util.Collections;

class L1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

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
//output
// [ganesh, ramesh, suresh, mahesh, vikrant, rahul]
// [ganesh, mahesh, rahul, ramesh, suresh, vikrant]