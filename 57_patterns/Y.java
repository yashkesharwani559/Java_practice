//print the value of the power

import java.util.Scanner;

public class Y {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        long res = 1;
        
        for  (int i = 0;  i  < power; i ++) {
            res *= base;
        }
        
        System.out.println("Result value: "+res);

        sc.close();
    }
}
