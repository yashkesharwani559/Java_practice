public class K {
    private int x = 50;

    class A {
        void pro() {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        new K().new A().pro();
    }
}
// means private members of the outer class are accessible to the members of the inner class
// and instance members of the outer class are directly accessible to the members of the inner class but to access the instance members of the inner class you have to write <inner-class-object>.<member-name> inside the members of the outer class
//output
// 50