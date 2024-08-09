class A {
    A() {
        super();
        this();
    }
}

//this will give compilation error because we cannot declare super() and this() call at the same time but we can implement one at a time and this call ought to be at the first line

// J3.java:4: error: call to this must be first statement in constructor
//         this();
//             ^
// 1 error
// error: compilation failed
