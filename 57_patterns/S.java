import java.util.Scanner;

public class S {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int temp = num;
        int res = 0;
        int t;

        while  (temp > 0 ) {
            t = temp % 10;
            res += t;
            temp /= 10;
        }
        
        System.out.println("The sum of the digits of the number " + num + " is " + res);

        sc.close();
    }
}
