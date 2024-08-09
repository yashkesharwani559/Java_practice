import java.util.ArrayList;

public class K {
    public static void main(String[] args) {

        Student s = new Student("mohan", 21, 86, 79, 46);

        System.out.println(s);

        ArrayList<Integer> arr = s.getMarks();

        arr.add(100);
        arr.add(200);
        arr.add(300);

        System.out.println(s);

    }
}
// here we can modify ArrayList values of the object of Student class because the ArrayList objects are mutable
//output
// mohan - 21 - [86, 79, 46]
// mohan - 21 - [86, 79, 46, 100, 200, 300]

class Student {
    private String name;
    private int age;
    private ArrayList<Integer> marks = new ArrayList<>();

    public Student(String name, int age, int... marks) {
        this.name = name;
        this.age = age;
        for (int m : marks) {
            this.marks.add(m);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public String toString() {
        return name + " - " + age + " - " + marks;
    }
}