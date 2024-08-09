public class W {
    public static void main(String[] args){
        try{
            int i = 12/0;
        } catch (ArithmeticException e) {
            System.out.println("catch runs");
            // throw new ArithmeticException();
            throw e;//correct
            //rethrowing exception 
            // when the catch throws the same exception that has to be handled by that catch then it is called rethrowing exception

        }
    }
}
