import java.util.Scanner;

class Student {
    String name;
    int age;
}
public class O1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[3];

        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();

            System.out.print("Enter your name: ");
            s[i].name = sc.nextLine();

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

//nextLine() method isused to take input of one line string till we donot click the enter 
// but in this code it has a catch that in the second loop turn the nextLine() takes the enter as input that we have clicked just before


// Enter your name: ti gjk
// Enter your age: 32
// Enter your name: Enter your age: 45
// Enter your name: Enter your age: 678
// ****************
// ti gjk
// 32

// 45

// 678
