import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//here we are creating more than one objects of the singleton class student using reflection api.

// public Constructor<T> -> this class is present in the java.lang.reflect package. It is a typesafe class and here T is the class whose constructors we get.

class K1 {
    public static void main(String[] args) {

        Student s = Student.getInstance();

        Class<? extends Student> klass = s.getClass();

        Constructor<Student>[] constructors = (Constructor<Student>[]) klass.getDeclaredConstructors();

        constructors[0].setAccessible(true);//making it accessible because the constructor of Student class is private.

        try {

            Student s1 = constructors[0].newInstance("om", 45);

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

class Student {

    private static Student x;

    String name;
    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student getInstance() {
        if (x == null)
            x = new Student("chitragupta", 500);

        return x;
    }
}

// public Constructor[] getDeclaredConstructors() -> this method is present in
// the Class class. This method is an instance method and that's why it can only
// be called from the Class class object of a class. After it, this method
// returns the array of all the constructors declared in that class. Here it
// returns all the constructors irrespective of their access mo9difiers.

// public final class Constructor<T> extends Executable -> So Constructor is a
// final class that extends the class Executable.
// this method is used to store the array of objects of Constructor class.
// here T is the typesafety which is the class whose constructor object we want.

// public T newInstance​(Object... initargs) throws InstantiationException,
// IllegalAccessException, IllegalArgumentException, InvocationTargetException
// -> newInstance() is a method in the Constructor class that takes Object
// var-arg as argument where we give the arguments that the constructor
// requires. Here there is no need to specify object because constructor is
// itself used to create objects.
// This method returns the object of the class if used typesafely or otherwise
// it returns the object in the form of Object class object.
// this method throws four exceptions also. They are InstantiationException,
// IllegalAccessException, IllegalArgumentException, InvocationTargetException.

// so now we study about all these exceptions one by one:-

// public class InstantiationException extends RectiveOperationException -> this
// exception is present in the java.lang package. So no need to import it. It is
// a checkedException. This exception is thrown by the newInstance() method of
// the Constructor class.
// This exception is thrown when the object of that class can't be instantiated
// using that constructor.
// and the object can't be instantiated because ofthese reasons:-
// 1.when the class object represents the abstract class, interface array class,
// a primitive type or void.
// 2. the class has no nullary constructor.
// a nullary constructor is a constructor that takes no argument.

// IllegalAccessException -> a checked exception present in java.lang package. this exception is thrown when we reflexively try to access a member of a class which is not accessible. but we can make it accessible using the setAccessible(true) method.

// IllegalArgumentException -> a unchecked exception in java.lang package that arises when we reflexively give the wrong arguments.

// InvocationTargetException -> a checked exception in java.lang.reflect package, so we need to import it. This exception covers all the exception that can be thrown when we invoke the method reflexively.