public class U2 {
    public static void main(String[] args){
        System.out.println(3);
        int x = 12 / 0;
        System.out.println(2);
        try{
            System.out.println(1);
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }
}

//output
// 3
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at U2.main(U2.java:4)