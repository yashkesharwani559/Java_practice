import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string1: ");
        String a = sc.nextLine();
        System.out.print("Enter string2: ");
        String b = sc.nextLine();

        int c = a.length() + b.length();
        System.out.println(c);

        if (a.length() > b.length()) {
            System.out.println("NO");
        } else {
            System.out.println("Yes");
        }

        int d = a.length();
        int e = b.length();
        String s = a.charAt(0) + "";
        String s1 = b.charAt(0) + "";

        System.out.println(
                s.toUpperCase() + a.substring(1, d) + " " + " " + s1.toUpperCase() + " " + " " + b.substring(1, e));

        sc.close();

    }

}
