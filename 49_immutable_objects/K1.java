import java.util.ArrayList;

//here making ArrayList object immutable

public class K1 {
    public static void main(String[] args) {

        Student s = new Student("mohan", 21, 86, 79, 46);

        System.out.println(s);

        ArrayList<Integer> arr = s.getMarks();

        arr.add(100);
        arr.add(200);
        arr.add(300);

        System.out.println(arr);
        System.out.println(s);

    }
}
//here the ArrayList is not updated because everytime the getMarks() returns the clone of the original ArrayList and any change in the clone doesnot affects the original

//output
// mohan - 21 - [86, 79, 46]
// [86, 79, 46, 100, 200, 300]
// mohan - 21 - [86, 79, 46]

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
        ArrayList<Integer> arr = null;

        arr = (ArrayList<Integer>) marks.clone();

        return arr;
    }

    public String toString() {
        return name + " - " + age + " - " + marks;
    }
}