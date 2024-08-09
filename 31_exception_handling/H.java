public class H {
    public static void main(String[] args) {
        System.out.println(1);
        if (12 < 13)
            try {
                System.out.println(2);
                System.out.println(3);
            } catch (ArithmeticException e) {
                System.out.println("solution");
            }
        System.out.println(4);
    }
}
//try-catch is allowed in the if, else, else if
//output