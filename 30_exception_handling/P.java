public class P {
    public static void main(String[] args) {
        System.out.println(1);
        
        try{
            System.out.println(2);
        } catch (ArithmeticException e) {
            System.out.println(3);
        }
        
        System.out.println(4);
    }
}
//output
// 1
// 2
// 4