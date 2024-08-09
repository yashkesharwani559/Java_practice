// steps to make a class singleton class. Here in one example you would learn one point.
// so first of all 1. make all the costructors private 

public class C {
    public static void main(String[] args){
        XC a = new XC();//compilation fail because the constructors are private of class XC
    }
}

class XC{
    private XC(){

    }
    private XC(int x){

    }
}

// C.java:6: error: constructor XC in class XC cannot be applied to given types;
//         XC a = new XC();//compilation fail because the constructors are private of class XC
//                ^
//   required: int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
// error: compilation failed