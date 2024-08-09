class A{
    A(){

    }
}
public class S extends A {
    A(){

    }
}

//this will give compilation error because constructors are not inhedrited and that's why they cannot be overrided in the child class
// S.java:7: error: invalid method declaration; return type required
//     A(){
//     ^
// 1 error