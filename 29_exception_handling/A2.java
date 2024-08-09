public class A2 {
    public static void main(String[] args) {
        
        System.out.println(1);

        String s = null;

        System.out.println(s.length());

        System.out.println(2);

    }
}

//output
// 1
// Exception in thread "main" java.lang.NullPointerException
//         at A2.main(A2.java:8)