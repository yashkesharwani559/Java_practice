//decimal to binary conversion  

import java.util.Scanner;

public class K{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();

        int decimal = num;
        int t = 0;
        String binary = "";

        while (decimal > 0) {
            t = decimal % 2;
            binary = t + binary;
            decimal /= 2;
        }

        System.out.println("The binary equivalent of the decimal number "+num+" is = "+binary);

        sc.close();
    }
}