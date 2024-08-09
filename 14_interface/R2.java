class A{}

class B{

}

interface R2 extends A{}

//this will give error because an interface cannot extend a class in java
// R2.java:7: error: interface expected here
// interface R2 extends A{}
//                      ^
// 1 error