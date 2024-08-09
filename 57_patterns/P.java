import java.util.Scanner;
 
public class P {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check that it is prime or not: ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Wrong Input. Try Again!!!");
        }else if(num <= 1){
            System.out.println("No prime number.");
        } else  if(num == 2){
            System.out.println("2 is a prime number.");
          
        } else {

            boolean flag = true;

            for (int i = 2; i < Math.pow(num, 0.5); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is NOT a prime number.");
            }

        }

        sc.close();
    }
}
