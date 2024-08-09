public class B extends BB {
    public static void main(String[] args) {

        BB a = new B();

        a.process();// Hello

    }

    void proces() {
        System.out.println("Hii");
    }
}
// here this code prints Hello because the process() method is not overridden
// correctly in the class B. Bnd that's why hii doesn't prints but the Hello
// prints.

// output
// Hello

class BB {
    void process() {
        System.out.println("Hello");
    }
}