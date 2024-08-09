import java.util.ArrayList;
import java.util.Collections;

public class N4 {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();

        arr.add(new Student("rohan", 21));
        arr.add(new Student("sohan", 18));
        arr.add(new Student("tohan", 23));
        arr.add(new Student("gohan", 22));
        arr.add(new Student("johan", 19));
        arr.add(new Student("kohan", 20));

        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr);

    }
}
//output
// [rohan$21, sohan$18, tohan$23, gohan$22, johan$19, kohan$20]
// [sohan$18, johan$19, kohan$20, rohan$21, gohan$22, tohan$23]

class Student implements Comparable<Student> {
    String name;
    Integer age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "$" + age;
    }

    public int compareTo(Student s) {
        return this.age.compareTo(s.age);
    }
}