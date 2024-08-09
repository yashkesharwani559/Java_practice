// abstract class T1 extends A{}
// this will give error becuase a class cannot extend an interface

// abstract class T1 extends A,B{}
//this will give error because an abstract class cannot extend one or more interfaces

// abstract class T1 implements A{}this will give no error
// abstract class T1 implements A,B{}this will give no error
//this above two will not give error because an abstract class can implement one or more interfaces at a time


interface A{}
interface B{
}