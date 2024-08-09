import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("The natural numbers till " + num + " are: ");

        for (int i = 1; i <= num; i++) {
            if (i == num) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }

        sc.close();
    }
}
