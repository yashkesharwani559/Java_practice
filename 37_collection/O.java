import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class O {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();

        arr.add(new Student("rohan", 21));
        arr.add(new Student("sohan", 18));
        arr.add(new Student("tohan", 23));
        arr.add(new Student("gohan", 22));
        arr.add(new Student("johan", 19));
        arr.add(new Student("kohan", 20));

        System.out.println(arr);

        Comparator<Student> comp = null;

        int n = sc.nextInt();
        switch(n){
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

        Collections.sort(arr, comp);//this is an overloaded version of sort() method that takes the List and Comparator object as argument

        System.out.println(arr);

    }
}

class NameAscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class NameDscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s2.name.compareTo(s1.name);
    }
}
class AgeAscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s1.age.compareTo(s2.age);
    }
}
class AgeDscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2){
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
}