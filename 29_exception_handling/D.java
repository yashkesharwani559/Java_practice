public class D {
    public static void main(String[] args) {
        
        System.out.println(1);
        
        try{
            System.out.println(3);
            int x = 112/0;
            System.out.println(4);
        } catch (ArithmeticException e) {
            System.out.println("solved");
        }
        System.out.println(2);
        
    }
}

//output
// 1
// 3
// solved
// 2