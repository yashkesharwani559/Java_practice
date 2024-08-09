public class D1 {
    public static void main(String[] args) {
        
        System.out.println(1);
        
        try{
            System.out.println(3);
            int[] x = { 0 , 1, 2};
            System.out.println(x[3]);
            System.out.println(4);
        } catch (ArrayIndexOutOfBoundsException e) {
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