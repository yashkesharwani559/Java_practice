interface A{

}
interface B{

}

class O extends A{

}
//this will give error because an interface can only be implemented by the class
// O.java:8: error: no interface expected here
// class O extends A{
//                 ^
// 1 error