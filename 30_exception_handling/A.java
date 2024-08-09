public class A {
    public static void main(String[] args) {
        
        System.out.println(1);

        int y = 12 / 0;//this line will give ArithmeticException and the program crashes here
        //here it is not giving compilation error because ArithmeticException is a type of unchecked exception ( ArithmeticException is the subclass of the RuntimeException )

        System.out.println(2);
        
    }
}

//output
// 1
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at A.main(A.java:6)