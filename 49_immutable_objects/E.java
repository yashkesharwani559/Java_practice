//to make a user-defined class object immutable we have to follow some steps
// 2. make all the properties of that class private so that no one can access it outside, also mark them final so that no one can never modify that value

final class Student {
    private final String name;
    private final int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

public class E {
    public static void main(String[] args) {

        Student s1 = new Student("vikrant", 22);

        System.out.println(s1);

        s1.name = "rahul";// compilation fail
        s1.age = 21;

        System.out.println(s1);

    }
}

// E.java:25: error: name has private access in Student
// s1.name = "rahul";// compilation fail
//   ^
// E.java:26: error: age has private access in Student
// s1.age = 21;
//   ^
// 2 errors
// error: compilation failed