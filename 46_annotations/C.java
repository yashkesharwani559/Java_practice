public class C extends CC {
    public static void main(String[] args) {

        CC a = new C();

        a.process();// Hello

    }

    @Override
    void proces() {
        System.out.println("Hii");
    }
}
// @Override -> is a general purpose annotation that is written on the top of the overridden method. This annotation is used that helps to check in the compilation that the method is successfully overridden or not.

// so here this gives compilation error because process() method is not successfully overridden in the class C


// C.java:10: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error
// error: compilation failed

class CC {
    void process() {
        System.out.println("Hello");
    }
}