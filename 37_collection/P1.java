import java.util.ArrayList;
import java.util.Collections;

public class P1 {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();

        arr.add("ganesh");
        arr.add("ramesh");
        arr.add("suresh");
        arr.add("mahesh");
        arr.add("rahul");
        arr.add("vikrant");

        System.out.println(arr);
        
        Collections.sort(arr);
        System.out.println(arr);

        int searchIndex = Collections.binarySearch(arr, "mahesh");//1

        // int searchIndex = Collections.binarySearch(arr, "rakesh");//-4
        //here if the searched element is not there then it returns the negative value as -(insertionIndex + 1)
        // so that's why it comes -4
        // ganesh 0
        // mahesh 1
        // rahul 2
        // and after it the rakesh will come so its insertionIndex is 3 for rakesh
        // so it will return -(insertionIndex + 1) = -(3 + 1) = -4
        // this is how it returns -4

        System.out.println(searchIndex);

    }
}
//static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) -> it is a static method in the Collections interface that takes two arguments where first is the object of List and the second is the key/value to be searched in the List. And after it it returns the index if the value is found and otherwise returns -(insertionIndex + 1) if value not found
// but this method should always pass a list that is sorted and if we pass a unsorted List then it will return unpredictable results