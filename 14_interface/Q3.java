class A{}

class B{
    
}

interface Q2 implements A,B{}

//this will give error because a class cannot implement anything

// Q3.java:7: error: '{' expected
// interface Q2 implements A,B{}
//             ^
// 1 error