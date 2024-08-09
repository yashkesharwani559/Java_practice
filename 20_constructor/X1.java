public class X1 {
    X1() {
        super();
        this();
    }
}
//this will give error because we can write only one at a time from this() and super() call

// X1.java:4: error: call to this must be first statement in constructor
//         this();
//             ^
// 1 error
