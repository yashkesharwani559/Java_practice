abstract class D{
    abstract void abc();
}
class C2{
    public static void main(String[] args){
        D x = new D();
    }
}
//this is not a valid code because we cannot create object of an abstract class in java
// this will give error as 
// C2.java:6: error: D is abstract; cannot be instantiated
//         D x = new D();
//               ^
// 1 error

// so we cannot access it using instantiation