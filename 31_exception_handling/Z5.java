class Z5 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException();
        } finally {
            throw new NullPointerException();
        }
    }
}
//so finally block runs before the throw of catch and finally block throws the NullPointerException

//output
// Exception in thread "main" java.lang.NullPointerException
//         at Z5.main(Z5.java:8)