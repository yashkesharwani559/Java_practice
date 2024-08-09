@FunctionalInterface
interface B1 {
    void pro();
    void mno();
}
//compilation fail because more than one declared methods


// B1.java:1: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   B1 is not a functional interface
//     multiple non-overriding abstract methods found in interface B1
// 1 error
// error: compilation failed