import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//to stop someone from creating more than one object of a singleton class using reflex api, we directly make the class into an enum

class L {
    public static void main(String[] args) {

        Student s = Student.getInstance();

        Class<? extends Student> klass = s.getClass();

        Constructor<Student>[] constructors = (Constructor<Student>[]) klass.getDeclaredConstructors();

        constructors[0].setAccessible(true);
        try {

            Student s1 = constructors[0].newInstance("om", 45);//this will give IllegalArgumentException because we can't create objects of an enum using reflection api.

            System.out.println(s);
            System.out.println(s1);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}

enum Student {

    AA("om", 12);

    String name;
    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student getInstance() {
        return AA;
    }
}


// Note: L.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
//         at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:484)
//         at L.main(L.java:18)