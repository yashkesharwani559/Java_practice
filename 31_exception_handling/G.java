public class G {
    public static void main(String[] args){
        System.out.println(1);
        System.out.println(2);
         
        try{
            System.out.println(3);
            System.out.println(4);
        } catch (ArithmeticException e) {
            System.out.println("solution");
        }
        
        System.out.println(5);
        System.out.println(6);
        
        try{
            System.out.println(7);
            System.out.println(8);
        } catch (ArithmeticException e) {
            System.out.println("solution");
        }

        
    }
}
//there can be multiple try-catch in java