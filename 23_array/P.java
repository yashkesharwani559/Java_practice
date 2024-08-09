import java.util.Scanner;

class Student {
    String name;
    int age;
}
public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[3];

        for (int i = 0; i < s.length; i++) {
            Student s1 = new Student();

            System.out.print("Enter your name: ");
            s1.name = sc.nextLine();

            System.out.print("Enter your age: ");
            s1.age = sc.nextInt();
            sc.nextLine();
            s[i] = s1;
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