//Task 4: to copy the array into a new array

public class S3 {
    public static void main(String[] args) {

        int[] x = { 10, 20, 30, 40, 50, 60 };

        int len = x.length;

        int[] y = new int[len];

        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }

        System.out.println("the new array 'y' is:");

        for (int val : y)
            System.out.print(val + ", ");

    }
}

// output
// the new array 'y' is:
// 10, 20, 30, 40, 50, 60,