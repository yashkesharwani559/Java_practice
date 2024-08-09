class A {
    public static void main(String[] args) {

        System.out.println(1);

        int x = 12 / 0;

        System.out.println(2);

    }
}


//output
// 1
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at A.main(A.java:6)