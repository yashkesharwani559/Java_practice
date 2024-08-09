import java.lang.reflect.Field;

//here accessing and modifying the final members of a class using the reflection api

public class H {
    public static void main(String[] args) throws IllegalAccessException {

        Student s1 = new Student("vikrant", 22);

        Class<? extends Student> klass = Student.class;

        System.out.println(s1);

        Field[] fields = klass.getDeclaredFields();

        fields[0].set(s1, "rahul");//IllegalAccessException because final variables can't be modified directly using the set() method in the reflection api
        fields[1].set(s1, 21);

        System.out.println(s1);

    }
}
// vikrant - 22
// Exception in thread "main" java.lang.IllegalAccessException: Can not set final java.lang.String field Student.name to java.lang.String
//         at java.base/jdk.internal.reflect.UnsafeFieldAccessorImpl.throwFinalFieldIllegalAccessException(UnsafeFieldAccessorImpl.java:76)
//         at java.base/jdk.internal.reflect.UnsafeFieldAccessorImpl.throwFinalFieldIllegalAccessException(UnsafeFieldAccessorImpl.java:80)
//         at java.base/jdk.internal.reflect.UnsafeQualifiedObjectFieldAccessorImpl.set(UnsafeQualifiedObjectFieldAccessorImpl.java:79)
//         at java.base/java.lang.reflect.Field.set(Field.java:780)
//         at H.main(H.java:16)

final class Student {
    final String name;
    final int age;

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

