import java.util.ArrayList;
import java.util.Collections;

public class P {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();

        arr.add("ganesh");
        arr.add("ramesh");
        arr.add("suresh");
        arr.add("mahesh");
        arr.add("rahul");
        arr.add("vikrant");

        System.out.println(arr);

        // int searchIndex = Collections.binarySearch(arr, "mahesh");//-2

        int searchIndex = Collections.binarySearch(arr, "rakesh");//-2
        //here we are calling binarySearch() method but here the records are not sorted so this will give unexpected results

        System.out.println(searchIndex);

    }
}
