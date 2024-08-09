public class W {
    void pro(){
        class X{//method local inner class

        }
    }
}
// method local inner class is a class that is created inside a method. We can mark final only in the method local inner class and the default one is already.
// the method local inner class is not accessible outside
// when we compile this file it will create 2 .class files namely W.class and W$1X.class
// here 1 is showing that it is of 1'st method
// 