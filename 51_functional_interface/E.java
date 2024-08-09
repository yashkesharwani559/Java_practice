
@FunctionalInterface
interface EE {
    void pro();
}

@FunctionalInterface
interface E extends EE {
    void mno();
}

// here the EE is a functional interface but the interface E is not a functional
// interface because it has two methods- one mno() and the second pro()
// inherited from the EE interface

// compilation fail

// E.java:7: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   E is not a functional interface
//     multiple non-overriding abstract methods found in interface E
// 1 error
// error: compilation failed
// PS D:\New folder\YASH\ingole