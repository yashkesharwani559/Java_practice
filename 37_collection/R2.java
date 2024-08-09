import java.util.Arrays;
 
public class R2 {
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
        Arrays.sort(x);//ClassCastException because Student didn't implements the Comparable interface

        for (Student a : x) {
            System.out.print(a + ", ");
        }
    }
}

//output
// mohan$21, rohan$22, sohan$19, gohan$23, zohan$18, johan$20,
// ==============
// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader com.sun.tools.javac.launcher.Main$MemoryClassLoader @2a798d51; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//         at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//         at java.base/java.util.Arrays.sort(Arrays.java:1249)
//         at R2.main(R2.java:19)

class Student{
    String name;
    int age;

    public String toString() {
        return name + "$" + age;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}