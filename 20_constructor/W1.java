public class W1{
    W1(){
        this();
    }
}

//this will give error because super() call is not there and infinite recursion occurs

// W1.java:2: error: recursive constructor invocation
//     W1(){
//     ^
// 1 error