public class J {
    public static void main(String[] args) {
        // J x = new J();
        // System.out.println(x.getClass());

        System.out.println(new J().getClass());//same as above
    }
}
//output
// class J


//public final Class<?> getClass()  --> a final instance method that is present in the alpha class Object. Since it is defined in the Object class that's why it is inherited to all classes in java. So it can be called in the object/instance of any class in java.
// this method returns the Class class object of the class from whoose object it is called
//It doesnot throws any exception.

