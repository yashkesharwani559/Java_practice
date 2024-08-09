public class R2 {
    abstract R2();
    abstract R2(int x){}
}

//this will give error because constructor can never be marked as abstract in java
// R2.java:2: error: modifier abstract not allowed here
//     abstract R2();
//              ^
// R2.java:3: error: modifier abstract not allowed here
//     abstract R2(int x){}
//              ^
// 2 errors