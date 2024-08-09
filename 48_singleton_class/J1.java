import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class J1 {
    public static void main(String[] args) {

        Student s1 = Student.getInstance();

        try {
            new ObjectOutputStream(new FileOutputStream("abc.txt")).writeObject(s1);

            Student s2 = (Student) new ObjectInputStream(new FileInputStream("abc.txt")).readObject();

            Student s3 = (Student) new ObjectInputStream(new FileInputStream("abc.txt")).readObject();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            // all will print different object because we have created more than one objects
            // of the singleton class using the Serializable-deserializable mechanism.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
// output
// Student@394df057
// Student@63070bab
// Student@68e5eea7

// to solve the problem that no one can create new objects using the
// Serialization-deserialization technique we create a method
// protected void readResolve(){
// return this;
// }

// this object will return the same object if the object is already created when
// we do the deserialization

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

    protected Object readResolve() {
        return x;
    }

    public static Student getInstance() {
        if (x == null)
            x = new Student("om", 34);

        return x;
    }
}