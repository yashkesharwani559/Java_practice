public class Z4 {
    public static void main(String[] args) {
        System.out.println(pro());
    }

    static int pro() {
        try {
            throw new ArithmeticException();
        } finally {
            return 0;
        }
    }
}
// so finally runs just before the return statement of the try or catch block
//output
// 0