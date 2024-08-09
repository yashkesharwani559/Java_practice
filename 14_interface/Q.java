interface A{

}

interface B{

}

interface C implements A{

}
//this will give error because an interface is not capable of implementing anything
// Q.java:9: error: '{' expected
// interface C implements A{
//            ^
// 1 error