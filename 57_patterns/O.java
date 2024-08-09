//check for Armstrong number
// 153 is an armstrong number because 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153. Here we have taken 3 cube because the digits are three.

import java.util.Scanner;

public class O {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");
        int num = sc.nextInt();

        String t = String.valueOf(num);

        int digits = t.length();

        int temp = num;

        int res = 0;

        int mid = 0;

        while (temp > 0) {

            mid = temp % 10;

            res += Math.pow(mid, digits);

            temp /= 10;
        }

        if(res == num){
            System.out.println(num+" is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
