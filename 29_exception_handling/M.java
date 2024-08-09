public class M {
    public static void main(String[] args){
        System.out.println(1); 
        try{
            System.out.println(2); 
            int x = 12/0;
            System.out.println(3); 
        }catch(ArithmeticException e){
            System.out.println("AE");
        }  
        finally {
            System.out.println("finally runs");
        }
        System.out.println(4); 
    }
}
//output
// 1
// 2
// AE
// finally runs
// 4