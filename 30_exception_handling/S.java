public class S {
    public static void main(String[] args) {
        System.out.println(1);
        pro();
    }
    static int pro(){
        System.out.println(12);
        throw new ArithmeticException();
    }
}
//it will not give any error in method pro() because we have thrown an exception and only one between throw or return will run at a time

//output
// 1
// 12
// Exception in thread "main" java.lang.ArithmeticException
//         at S.pro(S.java:8)
//         at S.main(S.java:4)