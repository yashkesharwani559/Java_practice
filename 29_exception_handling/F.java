public class F {
    public static void main(String[] args) {
        
        System.out.println(1);

        try {
            System.out.println(2);
            int x = 12/0;
            System.out.println(3);
            try{
                System.out.println(4);
                int x1 = Integer.parseInt("a");
                System.out.println(5);
            }catch(NumberFormatException e){
                System.out.println("NUmberFormatException");
            }
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        System.out.println(7);

    }
}

//nested try-catch blocks are allowed in java

//output
// 1
// 2
// ArithmeticException
// 7

//here in this example it is giving arithmetic error only because in the ry block if one exception comes then the below code inside the try will not run