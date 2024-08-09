public class P1 {
    private int y = 56;

    static class X {
        void pro() {
            System.out.println("pro" + y);
        }

        static void mno() {
            System.out.println("mno" + y);
        }
    }

    public static void main(String[] args) {
        X x = new X();
        X.mno();
        x.pro();
    }
}
//compilation fail because instance members of an outer class is not accessible to the nested class (members (method, initialization block, constructor) of the nested/static inner class)


// P1.java:5: error: non-static variable y cannot be referenced from a static context
//             System.out.println("pro" + y);
//                                        ^
// P1.java:9: error: non-static variable y cannot be referenced from a static context
//             System.out.println("mno" + y);
//                                        ^
// 2 errors
// error: compilation failed