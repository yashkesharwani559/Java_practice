//write a program to print the area of a triangle
// s = (a+b+c)/2;
// area = (s*(s-a)*(s-b)*(s-c)*)^0.5;

import java.util.Scanner;

public class W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of all three sides one by one: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int s = (a + b + c) / 2;

        double area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));

        System.out.println("The area of the triangle is: " + area);

        sc.close();
    }
}
