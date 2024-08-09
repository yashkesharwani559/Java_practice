public class D2 {
    public static void main(String[] args) {
        
        System.out.println(1);
        
        try{
            System.out.println(3);
            String x = null;
            System.out.println(x.length());
            System.out.println(4);
        } catch (NullPointerException e) {
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