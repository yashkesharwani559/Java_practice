import java.util.Comparator;
import java.util.Arrays;
 
public class S {
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
        Arrays.sort(x, new NameAscSort());
        for (Student a : x) {
            System.out.print(a + ", ");
        }
    }
}

//output
// mohan$21, rohan$22, sohan$19, gohan$23, zohan$18, johan$20,
// ==============
// gohan$23, johan$20, mohan$21, rohan$22, sohan$19, zohan$18,

class NameAscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class NameDscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.name.compareTo(o1.name);
    }
}

class AgeAscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.age.compareTo(o2.age);
    }
}

class AgeDscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.age.compareTo(o1.age);
    }
}

class Student {
    String name;
    Integer age;

    public String toString() {
        return name + "$" + age;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}