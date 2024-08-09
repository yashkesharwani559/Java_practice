//Reversing a given number
import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number which you want to reverse: ");
        int num = sc.nextInt();

        int temp = num;
        int res = 0;
        int t = 0;
 
        while (temp > 0) {

            t = temp % 10;

            res = res * 10 + t;

            temp /= 10;
        }
        
        System.out.println("The reverse of the number " + num + " is " + res);
        
        sc.close();
    }
}
