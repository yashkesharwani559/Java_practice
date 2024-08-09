class A{

}
class B{

}

class H extends A,B{

}
//this will give compilation error because multiple inheritance (multiple class inheritance) is not supported in java
// H.java:8: error: '{' expected
// class H extends A,B{
//                  ^
// 1 error