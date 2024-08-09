public class E2 {
    public static void main(String[] args) {
        
        System.out.println(1);

        try{
            System.out.println(2);

            int x = Integer.parseInt(args[0]);
            System.out.println(x);

        } catch (NumberFormatException e) {
           
           System.out.println("NFE");
        
        }
        
    }
}
//here this can give two exceptions onthe basis of inputs

//no input
//ArrayIndexOutOfBoundsException

//a
// NumberFormatException
