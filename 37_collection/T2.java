import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {

        int[] x = { 3, 3454, 56, 92, 12, 90, 25};

        for (int a : x) {
            System.out.print(a + ", ");
        }

        Arrays.sort(x);

        System.out.println("\n==============");

        for (int a : x) {
            System.out.print(a + ", ");
        } 

        // int searchIndex = Arrays.binarySearch(x, 82);// -5
        int searchIndex = Arrays.binarySearch(x, 95);// -7

        System.out.println("\n: " + searchIndex);
    }
}
//output
// 3, 3454, 56, 92, 12, 90, 25,
// ==============
// 3, 12, 25, 56, 90, 92, 3454,
// 4