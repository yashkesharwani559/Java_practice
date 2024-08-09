interface A{

}
interface B{

}

class O extends A,B{

}
//this will give error because a class cannot extend an interface
// O1.java:8: error: '{' expected
// class O extends A,B{
//                  ^
// 1 error