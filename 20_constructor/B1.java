public class B1 {
    B1(int a) {
        System.out.println("hii");
    }

    public static void main(String[] args) {
        // B1 b1 = new B1() ;//not ok
    }
}
// here it will give compilation error because if we create only one constructor
// then the compiler will not provide the constructor by itself and now the
// constructor that we have created has one formal argument whereas while
// calling we are passing no actual arguments.

// .java:7: error: constructor B1 in class B1 cannot be applied to given types;
// B1 b1 = new B1();//not ok
// ^
// required: int
// found: no arguments
// reason: actual and formal argument lists differ in length
// 1 error
// error: compilation failed
