public class J4 {
    static int x = 5;

    J4() {
        this();

    }

    J4(int x) {
        // this();
    }
}


// if we call same constructor inside same constructor then java will give recursive error as
// J4.java:3: error: recursive constructor invocation
//     J4() {
//     ^
// 1 error

