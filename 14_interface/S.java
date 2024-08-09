interface A{

}
interface B{

}

abstract class S extends A{

}
//this will give error because an abstract class cannot implement an interface
// S.java:8: error: no interface expected here
// abstract class S extends A{
//                          ^
// 1 error
