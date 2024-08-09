import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();

        arr.add(new Student("ganesh", 12));
        arr.add(new Student("ramesh", 12));
        arr.add(new Student("suresh", 12));
        arr.add(new Student("mahesh", 12));
        arr.add(new Student("rahul", 12));
        arr.add(new Student("vikrant", 12));

        System.out.println(arr);

        Comparator<Student> comp = null;
        comp = new NameAscSort();
        // comp = new NameDscSort();
        // comp = new AgeAscSort();
        // comp = new AgeDscSort();

        Collections.sort(arr, comp);

        System.out.println(arr);

        int searchIndex = Collections.binarySearch(arr, new Student("mahesh", 12), comp);//correct

        System.out.println(searchIndex);

    }
}


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
