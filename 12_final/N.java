class N{
    static final x;
    N(){
        x = 23;
    }
}
//this will give error as 
// N.java:2: error: <identifier> expected
//     static final x;
//                   ^
// 1 error

// this error  is because we cannot initialize static final variable inside the constructor