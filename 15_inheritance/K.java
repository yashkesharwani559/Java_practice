// cyclic inheritance is a type of inheritance but practically it is not possible in reality in any language and also in java
class A extends B{}

class B extends A{}
//this is an example of cyclic inheritance 
//but it will give error as 
// K.java:2: error: cyclic inheritance involving A
// class A extends B{}
// ^
// 1 error
//here in simple language it is not possible that a child class can be a parent of his parent class