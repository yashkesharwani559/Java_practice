public class P2 {
    private static int y = 56;

    static class X {
        void pro() {
            System.out.println("pro" + y);//pro56
        }

        static void mno() {
            System.out.println("mno" + y);//mno56
        }
    }

    public static void main(String[] args) {
        X x = new X();
        X.mno();
        x.pro();
    }
}
