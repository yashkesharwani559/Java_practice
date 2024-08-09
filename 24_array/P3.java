//task4:
// to print the odd numbers and to take the count of the even numbers
 
public class P3 {
    public static void main(String[] args) {

        int[] a = { 23, 435, 45, 3345, 53, 24, 54, 68, 34, 12 };

        System.out.println("the odd numbers are: ");

        int count = 0;

        // for (int i = 0; i < a.length; i++) {

        //     if (a[i] % 2 == 1) {
        //         System.out.println(a[i]);
        //     } else {
        //         count++;
        //     }

        // }

        for (int x : a) {
             if (x % 2 == 1) {
                System.out.print(x + ", ");
            } else {
                count++;
            }
        }

        System.out.println("\nThe number of even numbers in the array is " + count);
    }
}

//this will give output as
// the odd numbers are:
// 23
// 435
// 45
// 3345
// 53
// The number of even numbers in the array is 5
