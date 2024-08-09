
//print all prime ibers from a to b
import java.util.Scanner;

public class X {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting range:");
        int a = sc.nextInt();

        System.out.print("Enter the ending range:");
        int b = sc.nextInt();

        System.out.print("Prime numbers between " + a + " and " + b + " are: ");

        for (int i = a; i <= b; i++) {

            if (i < 0) {
                System.out.println("Wrong Input. Try Again!!!");
            } else if (i <= 1) {
                System.out.println("No prime number.");
            } else {

                boolean flag = true;

                for (int j = 2; j < Math.pow(i, 0.5); j++) {
                    if (j % i == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    System.out.print(i + ", ");
                }

            }
        }

        sc.close();
    }
}
