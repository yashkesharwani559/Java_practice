import java.lang.reflect.Field;

//here accessing and modifying the final members of a class using the reflection api

public class I {
    public static void main(String[] args) throws IllegalAccessException {

        Student s1 = new Student("vikrant", 22);

        Class<? extends Student> klass = Student.class;

        System.out.println(s1);

        Field[] fields = klass.getDeclaredFields();

        fields[0].setAccessible(true);
        fields[0].set(s1, "rahul");
        fields[1].setAccessible(true);
        fields[1].set(s1, 21);

        System.out.println(s1);

    }
}
// so means after using setAccessible(true), we can modify any property having
// any modifier. means setAccessible(true) is reflection api gives us power to
// modify the private and final both type properties

// output
// vikrant - 22
// rahul - 21

// so means the overall outcome is that through reflection api we can access anything having any access modifier

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
