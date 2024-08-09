import java.util.TreeMap;
import java.util.Comparator;
import java.util.Scanner;

public class K {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1 - NameAscSort\n 2 - NameDscSort\n 3 - AgeAscSort \n 4 - AgeDscSort\nEnter your choice: ");

        int n = sc.nextInt();

        Comparator comp = null;

        switch (n) {
            case 1:
                comp = new NameAscSort();
                break;
            case 2:
                comp = new NameDscSort();
                break;
            case 3:
                comp = new AgeAscSort();
                break;
            case 4:
                comp = new AgeDscSort();
                break;
            default:
                System.out.println("Wrong input");
        }

        TreeMap<Student, College> map = new TreeMap<Student, College>(comp);

        map.put(new Student("om", 21), new College("SRIT"));
        map.put(new Student("rom", 18), new College("JEC"));
        map.put(new Student("vyom", 22), new College("GGCT"));
        map.put(new Student("ehom", 19), new College("Global"));
        map.put(new Student("wom", 20), new College("GGITS"));

        Student s = map.floorKey(new Student("om", 23));
        //floorKey(K toKey) -> is a method in TreeMap class that returns a K type key that is the greatest key among the keys that are less than or equals to the toKey or returns null if there is no such key

        System.out.println(s);

    }
}

class NameAscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class NameDscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.name.compareTo(s1.name);
    }
}

class AgeAscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age.compareTo(s2.age);
    }
}

class AgeDscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.age.compareTo(s1.age);
    }
}

class Student {
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
        return this.name.compareTo(s.name);
    }
}

class College {
    String name;

    College(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
