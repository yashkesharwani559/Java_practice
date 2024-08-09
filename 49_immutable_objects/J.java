import java.lang.reflect.Field;

public class J {
    public static void main(String[] args) throws IllegalAccessException {
        String s = "mohan";

        System.out.println(s);

        Class klass = String.class;

        Field[] fields = klass.getDeclaredFields();

        for (Field f : fields) {
            if (f.getName() == "value") {
                f.setAccessible(true);
                f.set(s, new Byte((byte) 12));
            }
        }

        System.out.println(s);

    }
}

//cannot modify value (variable) of String class

// mohan
// WARNING: An illegal reflective access operation has occurred
// WARNING: Illegal reflective access by J (file:/D:/New%20folder/YASH/ingole%20sir/Core%20Java/49_immutable_objects/) to field java.lang.String.value
// WARNING: Please consider reporting this to the maintainers of J
// WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
// WARNING: All illegal access operations will be denied in a future release
// Exception in thread "main" java.lang.IllegalArgumentException: Can not set final [B field java.lang.String.value to java.lang.Byte
//         at java.base/jdk.internal.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(UnsafeFieldAccessorImpl.java:167)
//         at java.base/jdk.internal.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(UnsafeFieldAccessorImpl.java:171)
//         at java.base/jdk.internal.reflect.UnsafeQualifiedObjectFieldAccessorImpl.set(UnsafeQualifiedObjectFieldAccessorImpl.java:83)
//         at java.base/java.lang.reflect.Field.set(Field.java:780)
//         at J.main(J.java:16)