public class D3 {
    public static void main(String[] args) {
        
        System.out.println(1);
        
        try{
            System.out.println(3);
            int x = Integer.parseInt("h");
            System.out.println(4);
        } catch (NumberFormatException e) {
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