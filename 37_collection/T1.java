import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {

        int[] x = { 3, 3454, 56, 92, 12, 90, 25 };

        for (int a : x) {
            System.out.print(a + ", ");
        }

        Arrays.sort(x);

        System.out.println("\n==============");

        for (int a : x) {
            System.out.print(a + ", ");
        } 

        // int searchIndex = Arrays.binarySearch(x, 12);//1
        int searchIndex = Arrays.binarySearch(x, 90);// 4

        System.out.println("\n" + searchIndex);
    }
}
//output
// 3, 3454, 56, 92, 12, 90, 25,
// ==============
// 3, 12, 25, 56, 90, 92, 3454,
// 4