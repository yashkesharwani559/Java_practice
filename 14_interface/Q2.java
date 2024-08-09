class A{}

class B{
    
}

interface Q2 implements A{}
//this will give error because interface cannot implement anything in java
// so a class class cannot be implemented in an interface 
// Q2.java:7: error: '{' expected
// interface Q2 implements A{}
//             ^
// 1 error