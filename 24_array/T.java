//Task 3: to find the largest and the smallest odd number

public class T {
    public static void main(String[] args) {

        // int[] arr = { 12, 43, 56, 67, 89, 91, 34, 57, 29 };
        // int[] arr = { 1, 43, 56, 67, 89, 91, 34, 57, 29 };
        int[] arr = { -1, 43, -6, 67, 89, 91, 34, 57, 29 };

        int large = 0;
        int small = 0;

        for (int val : arr) {
            if (val % 2 == 1 || val % 2 == -1) {
                large = val;
                small = val;
                break;
            }
        }
        //  we have written this above code to assign the large and small variable a
        // initial value that is odd

        for (int val : arr)
            System.out.print(val + ", ");

        System.out.println("\n\n");

        for (int val : arr) {
            if (val % 2 == 1) {
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

// The largest number of the array is = 56
// The smallest number of the array is = 12
