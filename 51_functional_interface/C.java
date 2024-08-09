@FunctionalInterface
interface C {
    void pro();

    void pro(int x);
}
// compilation fail because more than one declared methods are not allowed in a
// functional interface


// C.java:1: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   C is not a functional interface
//     multiple non-overriding abstract methods found in interface C
// 1 error
// error: compilation failed