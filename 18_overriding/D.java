class A {
    static void pro() {
    }
}

class B extends A {
    void pro() {
    }
}

// this will give compilation error at line 6 because
// a static method can be overridden but it must have same method signature
// means static must be applied on the child class version

// D.java:6: error: pro() in B cannot override pro() in A
// void pro() {
// ^
// overridden method is static
// 1 error
// error: compilation failed
