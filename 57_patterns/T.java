import java.util.Scanner;

public class T {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter all three numbers one by one: ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        System.out.println("The greatest number between " + a1 + ", " + a2 + "and " + a3 + " is "+ ( (a1>a2) ? ( a1>a3 ? a1 : a3): ( a2>a3? a2 : a3)));

        sc.close();
    }
}
