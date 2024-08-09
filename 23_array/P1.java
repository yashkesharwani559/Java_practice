import java.util.Scanner;

class Student {
    static Scanner sc = new Scanner(System.in);

    Student() {
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    String name;
    int age;

    void show() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class P1 {
    public static void main(String[] args) {

        Student[] s = new Student[3];

        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
        }

        System.out.println("****************");

        for (int i = 0; i < s.length; i++) {
            s[i].show();
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