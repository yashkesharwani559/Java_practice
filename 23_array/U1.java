import java.util.Scanner;

public class U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int[] a = new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt() };

        //this above is a valid legal code

        for (int b : a) {
            System.out.println(b);
        }
    }
}
