//task 5: to copy the array into a new array by reversing it 

public class S4 {
    public static void main(String[] args) {

        int[] x = { 10, 20, 30, 40, 50, 60 };

        int len = x.length;

        int[] y = new int[len];

        for (int i = len - 1; i > -1; i--) {
            y[len - i - 1] = x[i];
        }

        System.out.println("the new array 'y' is:");

        for (int val : y)
            System.out.print(val + ", ");

    }
}

// output
// the new array 'y' is:
// 60, 50, 40, 30, 20, 10,