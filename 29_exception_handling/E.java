public class E {
    public static void main(String[] args) {
        
        System.out.println(1);
        
        try{
            System.out.println(3);
            String s = null;
            System.out.println(s.length());
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
// Exception in thread "main" java.lang.NullPointerException
//         at E.main(E.java:9)


//this is because catch is there for the ArithmeticException only
