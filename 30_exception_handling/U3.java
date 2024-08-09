public class U3 {
    public static void main(String[] args) {
        pro();
    }

    static int pro() {
        try {
            int x = 12/0;
        } catch (ArithmeticException e) {
            return 2;
        }

        return 122;
    }
}
//correct code