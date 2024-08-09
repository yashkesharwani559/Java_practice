public class H1 {
    public static void main(String[] args) {
        System.out.println(1);
        
        int i  =   0;
        while(i<3){
            try {
                System.out.println(2);
                System.out.println(3);
            } catch (ArithmeticException e) {
                System.out.println("solution");
            }
            i++;
        }
        System.out.println(4);
    }
}
//try-catch is allowed in the loop body