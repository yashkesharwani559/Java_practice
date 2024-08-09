public class W {
    W() {
        this(10);
    }
    W(int x){
        this();
        System.out.println(x);

    }
}

//this will give error because here compiler is smart enough to check that it is an infinite recursion and also super() call is not there in any constructor
// W.java:5: error: recursive constructor invocation
//     W(int x){
//     ^
// 1 error
