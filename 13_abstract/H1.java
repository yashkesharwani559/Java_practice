class H1{
    abstract static int x;
    abstract static int y = 45;
}

//this will give error because we cannot mark variables as abstract
// H1.java:2: error: modifier abstract not allowed here
//     abstract static int x;
//                         ^
// H1.java:3: error: modifier abstract not allowed here
//     abstract static int y = 45;
//                         ^
// 2 errors