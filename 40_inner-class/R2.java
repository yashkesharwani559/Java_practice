public class R2 extends R2.XX{
    class XX{

    }
}
//compilation error because inner class cannot be the parent of the outer class
// R2.java:1: error: cyclic inheritance involving R2
// public class R2 extends R2.XX{
//        ^
// 1 error
// error: compilation failed

// this is not allowed because the inner class object can only be created using outer class object and if inner class is the parent of outer class after it then this creates the cyclic inheritance / infinite recursion of constructors. And that's why it is not allowed