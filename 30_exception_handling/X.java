public class X {
    public static void main(String[] args){
        try{
          
            int i = 12/0;
        
        } catch (ArithmeticException e) {

            System.out.println("catch runs");
            System.out.println(e);
            throw new IllegalArgumentException();
            //converting one exception to another
            //and converting one exception to another exception is called chained exception
        
        }
    }
}