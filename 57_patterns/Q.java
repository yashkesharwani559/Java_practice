import java.util.Scanner;
 
public class Q {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms you want of the fibonacci series: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Wrong Input. Try Again!!!");
        } else {
            
            int a1 = 0;
            int a2 = 1;

            if (num == 1) {
                System.out.println("Fibonacci series: " + a1);
            }else if(num == 2){
                System.out.println("Fibonacci series: " + a1 + ", " + a2);
            } else {
                System.out.print("Fibonacci series: " + a1 + ", " + a2 + ", ");
                
                for (int i = 3; i <= num; i++) {
                    if(i == num){
                        System.out.println(a2+a1);
                    } else {
                        int temp = a2;
                        a2 = a1 + a2;
                        a1 = temp;
                        System.out.print(a2 +", ");
                    }
                }
            }
            
        }

        sc.close();
    }
}
