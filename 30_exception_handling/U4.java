public class U4 {
    public static void main(String[] args) {
        pro();
    }

    static int pro() {
        try {
            throw new  ArithmeticException();
        } catch (ArithmeticException e) {
            return 2;
        }

    }
}
//correct code