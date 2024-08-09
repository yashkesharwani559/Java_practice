// binary to decimal conversion 

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number which you want to convert: ");

        String input = sc.next();

        Pattern pattern = Pattern.compile("^[01]+$");
        
        Matcher matcher = pattern.matcher(input);

        System.out.println();


        if (matcher.find()) {
            
            int binary = Integer.valueOf(input);
            
            int decimal = 0;

            int t = 0;
            int i = 0;
            
            while (binary > 0) {
                t = binary % 10;
                decimal += t * Math.pow(2, i++);
                binary = binary / 10;
            }

            System.out.println("The decimal equivalent of the binary number "+input + " is "+decimal);
            
        } else {

            System.out.println("Wrong Input. Try Again!!!");

        }

        sc.close();
    }
}
