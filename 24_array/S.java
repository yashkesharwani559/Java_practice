// Task 1: to find the largest number in the array

public class S {
    public static void main(String[] args) {
        int num = 0;

        int[] arr = { 1, 45, 56, 86, 23, 78, 98, 102, 234 };

        for (int val : arr)
            System.out.print(val + ", ");

        System.out.println("\n\n");

        for (int val : arr) {
            if (num < val)
                num = val;
        }

        System.out.println("The largest number in the array is = " + num);
    }
}

// output
// 1, 45, 56, 86, 23, 78, 98, 102, 234,


// The largest number in the array is = 234