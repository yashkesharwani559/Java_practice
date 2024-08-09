@FunctionalInterface
abstract class G{
    abstract void pro();
}
// compilation fail because @FunctionalInterface annotation is applicable only on the interface

// G.java:1: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   G is not a functional interface
// 1 error
// error: compilation failed