
//check if a number is a palindrome number
// 121 is a palindrome number
import java.util.Scanner;

public class R {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");
        int num = sc.nextInt();

        int temp = num;
        int res = 0;
        int t = 0;

        while (temp > 0) {

            t = temp % 10;
            res = t + res * 10;
            temp /= 10;
        }

        if (res == num) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is NOT a palindrome number.");
        }

        sc.close();
    }
}
