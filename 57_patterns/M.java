//print factorial of a number

import java.util.Scanner;

public class M {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number whose factorial you want: ");
        int num = sc.nextInt();

        
        if(num < 0){
            System.out.println("Wrong Input. Try Again!!!");
        }else{
            
            long res = 1;

            for (int i = 1; i <= num; i++) {
                res *= i;
            }

            System.out.println("The factorial of the number "+num+" is "+res);
        }
        sc.close();
    }
}
