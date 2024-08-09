public class B3 {
    public static void main(String[] args) {
        // new B3(12);// not ok
    }

}
// this will give compilation error because here the default constructor exist
// in the class but the default constructor is a no parameterized constructor

// B3.java:3: error: constructor B3 in class B3 cannot be applied to given
// types;
// new B3(12);// not ok
// ^
// required: no arguments
// found: int
// reason: actual and formal argument lists differ in length
// 1 error
// error: compilation failed
