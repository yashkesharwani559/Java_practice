import java.util.Scanner;

class Student {
    String name;
    int age;
}
public class O2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[3];

        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();

            System.out.print("Enter your name: ");
            s[i].name = sc.nextLine();

            System.out.print("Enter your age: ");
            s[i].age = sc.nextInt();
            sc.nextLine();
        }
        
        System.out.println("****************");

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].name);
            System.out.println(s[i].age);
        }

    }
}


// Enter your name: yash boas
// Enter your age: 123
// Enter your name: yafasdfas sfs
// Enter your age: 45
// Enter your name: asywertwedg sdffgdsfe
// Enter your age: 56
// ****************
// yash boas
// 123
// yafasdfas sfs
// 45
// asywertwedg sdffgdsfe
// 56