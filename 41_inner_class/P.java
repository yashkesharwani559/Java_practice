public class P {
    static class X {
        void pro() {
            System.out.println("pro");
        }

        static void mno() {
            System.out.println("mno");
        }
    }

    public static void main(String[] args) {
        X x = new X();
        X.mno();
        x.pro();
    }
}

// mno
// pro

// so in jdk 11, we can create the static methods and members also inside the static inner class(nested class)