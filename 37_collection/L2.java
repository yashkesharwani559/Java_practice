import java.util.ArrayList;
import java.util.Collections;

class L2 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        //not using it typesafely

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