public class X{
    X(){
        this();
        super();
    }
}

//this will give error because we can write only one from super() or this() call at a time
// X.java:4: error: call to super must be first statement in constructor
//         super();
//              ^
// X.java:2: error: recursive constructor invocation
//     X(){
//     ^
// 2 errors
