public class V {

    static GG2 g = new GG2() {
        void pro() {
            System.out.println("x");
        }
    };

    public static void main(String[] args) {
        System.out.println(g);
    }
}

abstract class GG2 {
    abstract void pro();
}
