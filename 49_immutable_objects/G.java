import java.lang.reflect.Field;

//here accessing and modifying the private members of a class using the reflection api

public class G {
    public static void main(String[] args) throws IllegalAccessException {

        Student s1 = new Student("vikrant", 22);

        Class<? extends Student> klass = Student.class;

        System.out.println(s1);

        Field[] fields = klass.getDeclaredFields();

        fields[0].setAccessible(true);// to overcome private
        fields[0].set(s1, "rahul");

        fields[1].setAccessible(true);// to overcome private
        fields[1].set(s1, 21);

        System.out.println(s1);

    }
}
// output
// vikrant 22
// rahul 21

final class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
