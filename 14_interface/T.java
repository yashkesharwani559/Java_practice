class A{}
class B{}

// abstract class T implements A{}
//this will give error because an abstract class cannot implement a class
// T.java:4: error: interface expected here
// abstract class T implements A{}
//                             ^
// 1 error


// abstract class T implements A,B{}
// T.java:12: error: interface expected here
// abstract class T implements A,B{}
//                             ^
// T.java:12: error: interface expected here
// abstract class T implements A,B{}
//                               ^
// 2 errors


// abstract class T extends A{}
//this is a correct code so an abstract class can extend a concrete class


abstract class T extends A,B{}
// this will give error because a class cannot extend more than one class at a time
// T.java:26: error: '{' expected
// abstract class T extends A,B{}
//                           ^
// 1 error