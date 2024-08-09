//Task 2: to find the smallest number of the array

public class S1 {
    public static void main(String[] args) {
        int[] arr = { 234, 45, 12, 56, 67, 89, 90, 10, 29, 5 };

        int num = arr[0];

        for (int val : arr)
            System.out.print(val + ", ");

        System.out.println("\n\n");

        for (int val : arr) {
            if (num > val)
                num = val;
        }

        System.out.println("The smallest number in the array is = " + num);
    }
}

// output
// 234, 45, 12, 56, 67, 89, 90, 10, 29, 5,


// The smallest number in the array is = 5