abstract class C{
    abstract void C1();
}
//abstract is not applicable on the constructors and the variables (class level and local level)

class D extends C{

}
// this will give error because we can extend the abstact class and make it parent class only when firstly we can declare the child class as public or secondly we must define the abstract method

// D.java:1: error: class, interface, or enum expected
// absatract class C{
// ^
// 1 error