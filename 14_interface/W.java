class A{

}
interface B{

}
interface C{

}

class C implements B,C extends A{}
//this will give error because correct order is 
// class extends implements 
// W.java:11: error: '{' expected
// class C implements B,C extends A{}
//                       ^
// 1 error