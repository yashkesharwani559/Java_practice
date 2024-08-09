@FunctionalInterface
interface Q1 {
    void pro();
    void pro1();
}//compilation fail
// because Q1 is not a functional interface

// Q1.java:1: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   Q1 is not a functional interface
//     multiple non-overriding abstract methods found in interface Q1
// 1 error
// error: compilation failed
