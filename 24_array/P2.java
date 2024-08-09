//task 3
// to write a program that will take a number from user as input and prints all the numbers in the array that are larger than the input given by the user


import java.util.Scanner;
 
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 34, 45563, 56, 12, 2, 2, 53, 34, 324 };

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("the numbers greater than the " + n + " are ");

        // for (int i = 0; i < a.length; i++) {

        //     if(a[i] > n){
        //         System.out.println(a[i]);
        //     }
        // }

    
        for (int x : a) {
            if(x > n)
                System.out.print(x + ", ");
        }


    }
}

//this will give output as
// Enter the number: 10
// the numbers greater than the 10 are
// 34
// 45563
// 56
// 12
// 53
// 34
// 324