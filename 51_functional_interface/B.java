
//means a functional interface must have one method in it

@FunctionalInterface
interface B {

}

// B.java:4: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   B is not a functional interface
//     no abstract method found in interface B
// 1 error
// error: compilation failed