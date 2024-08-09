import java.util.Arrays;
 
public class R3 {
    public static void main(String[] args) {

        Student[] x = {
                new Student("mohan", 21),
                new Student("rohan", 22),
                new Student("sohan", 19),
                new Student("gohan", 23),
                new Student("zohan", 18),
                new Student("johan", 20)
        };

        for (Student a : x) {
            System.out.print(a + ", ");
        }
        System.out.println("\n==============");
        Arrays.sort(x);

        for (Student a : x) {
            System.out.print(a + ", ");
        }
    }
}
//output
// mohan$21, rohan$22, sohan$19, gohan$23, zohan$18, johan$20,
// ==============
// gohan$23, johan$20, mohan$21, rohan$22, sohan$19, zohan$18,

class Student implements Comparable<Student>{
    String name;
    int age;

    public String toString() {
        return name + "$" + age;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student s1){
        return this.name.compareTo(s1.name);
    }
}