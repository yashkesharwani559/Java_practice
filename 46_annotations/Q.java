@FunctionalInterface
interface Q {

}
// this will give compilation fail
// this is because of the @FunctionalInterface annotation


// Q.java:1: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   Q is not a functional interface
//     no abstract method found in interface Q
// 1 error
// error: compilation failed


// @FunctionalInterface -> a general purpose annotation in java.lang package and that's why no need to import it. This annotation is only applicable on the interfaces that are functional interfaces and otherwise in any condition, this will generate a compilation error. And that's why we can say that it provides a compile time security.
// A functional interface that has any number of defined methods but it must have only one declared methods.
// and we can define methods in the interface using static, private and default keyword.
