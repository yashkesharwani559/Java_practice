public class U1 {
    public static void main(String[] args) {
        pro();
    }

    static int pro() {
        try {
            return 0;
        } catch (ArithmeticException e) {
            // return 2;
        }

        return 1;
    }
}

//legal correct code
