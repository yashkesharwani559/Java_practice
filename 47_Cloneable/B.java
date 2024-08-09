public class B {
    public static void main(String[] args) {
        B b = new B();
        B b1 = b.clone();//compilation fail
        // because clone() returns object of Object class

    }
}
// B.java:4: error: incompatible types: Object cannot be converted to B
//         B b1 = b.clone();//compilation fail
//                       ^
// 1 error
// error: compilation failed


// protected Object clone() -> clone() is a protected instance method in the Object class. Object class is in java.lang package.
// And since it is in the Object class that's why it is inherited to all the classes in java.
// but since this method is protected, so this method is accessible only inside the subclass of the class Object and also by only using the object of that subclass.
// this method also gives the CloneNotSupportedException which is a checked exception in java.lang package and that's why no need to import it. and to resolve this Exception we have to implement the Cloneable interface in our class