import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q1 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        arr.add(new Student("ganesh", 12));
        arr.add(new Student("ramesh", 12));
        arr.add(new Student("suresh", 12));
        arr.add(new Student("mahesh", 12));
        arr.add(new Student("rahul", 12));
        arr.add(new Student("vikrant", 12));

        System.out.println(arr);

        Collections.sort(arr, new NameAscSort());

        System.out.println(arr);

        int searchIndex = Collections.binarySearch(arr, new Student("mahesh", 12));//gives ClassCastException because Student class didn't implements the Comparable interface 

        System.out.println(searchIndex);

    }
}

//output
// [ganesh-12, ramesh-12, suresh-12, mahesh-12, rahul-12, vikrant-12]
// [ganesh-12, mahesh-12, rahul-12, ramesh-12, suresh-12, vikrant-12]
// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader com.sun.tools.javac.launcher.Main$MemoryClassLoader @ba2f4ec; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.Collections.indexedBinarySearch(Collections.java:229)
//         at java.base/java.util.Collections.binarySearch(Collections.java:217)
//         at P1.main(Q.java:22)

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

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }
}
