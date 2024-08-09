//task 1
//to print the sum of all values of an int array 

public class P {
    public static void main(String[] args) {
        int[] a = { 12, 34, 24, 2, 24 };
        int sum = 0;

        // for(int i= 0; i< a.length; i++){
        // sum += a[i];
        // }

        for (int x : a)
            sum += x;

        System.out.println("the sum is " + sum);
    }
}
// output
// the sum is 96