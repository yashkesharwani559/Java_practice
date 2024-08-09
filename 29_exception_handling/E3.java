public class E3 {
    public static void main(String[] args) {
        
        System.out.println(1);

        try{
            System.out.println(2);

            int x = Integer.parseInt(args[0]);
            System.out.println(x);

        } catch (Exception e) {
           
           System.out.println("NFE");
        
        }
        
    }
}
//input-output

//no input
//NFE

//a
// NFE

