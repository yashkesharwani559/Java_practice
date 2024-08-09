import java.util.Scanner;

class Student {
    String name;
    int age;
}
public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[3];

        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();

            System.out.print("Enter your name: ");
            s[i].name = sc.next();

            System.out.print("Enter your age: ");
            s[i].age = sc.nextInt();
        }
        
        System.out.println("****************");

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].name);
            System.out.println(s[i].age);
        }

    }
}
//there is one problem with the next method that this method only takes one word as the input if there is a space between the string then it will takes the first part only


// this will do it as 
// Enter your name: yash
// Enter your age: 12
// Enter your name: yasdh
// Enter your age: 23
// Enter your name: ertgdf
// Enter your age: 45
// ****************
// yash
// 12
// yasdh
// 23
// ertgdf
// 45
