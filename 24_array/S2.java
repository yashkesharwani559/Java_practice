//Task 3: to find the largest and the smallest even number

public class S2 {
    public static void main(String[] args) {

        // int[] arr = { 12, 43, 56, 67, 89, 91, 34, 57, 29 };
        // int[] arr = { 1, 43, 56, 67, 89, 91, 34, 57, 29 };
        int[] arr = { -1, 43, -6, 67, 89, 91, 34, 57, 29 };

        int large = 0;
        int small = 0;

        for (int val : arr) {
            if (val % 2 == 0) {
                large = val;
                small = val;
                break;
            }
        }
        //we have written this above code to assign the large and small variable an initial value that is even

        for (int val : arr)
            System.out.print(val + ", ");

        System.out.println("\n\n");

        for (int val : arr) {
            if (val % 2 == 0) {
                if (large < val) {
                    large = val;
                }
                if (small > val) {
                    small = val;
                }
            }
        }

        System.out.println("The largest number of the array is = " + large);

        System.out.println("The smallest number of the array is = " + small);

    }
}

// output
// 12, 43, 56, 67, 89, 91, 34, 57, 29,


// The largest number of the array is = 56
// The smallest number of the array is = 12
