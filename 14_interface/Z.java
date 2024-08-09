interface A {
    default void mno() {
        super.hello();
    }
}
// super is not allowed inside the interface. That's why this will give
// compilation error


// Z.java:3: error: cannot find symbol
//         super.hello();
//         ^
//   symbol:   variable super
//   location: interface A
// 1 error
// error: compilation failed