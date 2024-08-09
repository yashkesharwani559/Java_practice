import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J2 {
    public static void main(String[] args) {
        Student s = Student.getInstance("om", 12);

        try {
            new ObjectOutputStream(new FileOutputStream("abc.txt")).writeObject(s);

            Student s1 = (Student) new ObjectInputStream(new FileInputStream("abc.txt")).readObject();

            Student s2 = (Student) new ObjectInputStream(new FileInputStream("abc.txt")).readObject();

            System.out.println(s);
            System.out.println(s1);
            System.out.println(s2);
            // here this will always return different object because readResolve() method of
            // the Student class is returning this and inside the readResolve(), this refers
            // to the new object that is created, but if we return x (variable in which the
            // object of Student class is stored) from the readResolve() then it will always
            // return the same object.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {

}

class Student extends User {
    private static Student x;

    String name;
    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student getInstance(String name, int age) {
        if (x == null)
            x = new Student(name, age);

        return x;
    }

    protected Object readResolve() {
        return this;
    }
    // here this will always return different object because readResolve() method of
    // the Student class is returning this and inside the readResolve(), this refers
    // to the new object that is created, but if we return x (variable in which the
    // object of Student class is stored) from the readResolve() then it will always
    // return the same object.

}