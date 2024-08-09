import java.util.ArrayList;
import java.util.Collections;
 
public class N1 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        arr.add(new Student("rohan", 21));
        arr.add(new Student("sohan", 18));
        arr.add(new Student("tohan", 23));
        arr.add(new Student("gohan", 22));
        arr.add(new Student("johan", 19));
        arr.add(new Student("kohan", 20));

        System.out.println(arr);

        Collections.sort(arr);//it gives ClassCastException

        System.out.println(arr);

    }
}

class Student {
    String name; 
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + "$" + age;
    }
}
// [rohan$21, sohan$18, tohan$23, gohan$22, johan$19, kohan$20]
// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader com.sun.tools.javac.launcher.Main$MemoryClassLoader @74f0ea28; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//         at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//         at java.base/java.util.Arrays.sort(Arrays.java:1315)
//         at java.base/java.util.Arrays.sort(Arrays.java:1509)
//         at java.base/java.util.ArrayList.sort(ArrayList.java:1750)
//         at java.base/java.util.Collections.sort(Collections.java:145)
//         at N1.main(N1.java:17)