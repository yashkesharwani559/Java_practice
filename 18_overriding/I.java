public class I extends A{
    void pro(){}

    void pro(){}
}

class A{
    void pro(){}
}

//this will give compilation error at line 4 because in method overriding a 
// child class can redeclare/override only once the method and if he trys to do it twice it will be considered as method overloading

//this will give error as
// I.java:4: error: method pro() is already defined in class I
//     void pro(){}
//          ^
// 1 error
// error: compilation failed