class A {
    void pro() {
        System.out.println("hello");
    }

    // void pro() {
    //     System.out.println("hii");
    // }
}
// this will give compilation error because at the line 5 we are redeclaring
// method with same signature
// A.java:5: error: method pro() is already defined in class A
// void pro(){
// ^
// 1 error
// error: compilation failed