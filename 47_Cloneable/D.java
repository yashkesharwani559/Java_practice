public class D {
    public static void main(String[] args) throws CloneNotSupportedException {
        D b = new D();
        D b1 = (D) b.clone();//thrown the CloneNotSupportedException because class D doesn't implements the Cloneable interface

    }
}


// Exception in thread "main" java.lang.CloneNotSupportedException: F
//         at java.base/java.lang.Object.clone(Native Method)
//         at F.main(F.java:4)