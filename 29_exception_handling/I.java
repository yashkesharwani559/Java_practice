public class I {
    public static void main(String[] args) {
        
        System.out.println(1);
        try{
            int i = Integer.parseInt(args[0]);
            System.out.println(2);
            int[] x = {3, 0, 2};
            System.out.println(x[i]);
            System.out.println(3);
            int y = 12/x[i];
        }catch(Exception e){
            System.out.println(e);
        } //here this code is correct because Exception is parent class of all Exception classes so child class object can be assigned to child class variable that's why it is correct 
          //but this code is not reliable  because it prints same solution for all exceptions

        System.out.println(5);

    }
}

//input - output

// nothing
//1
// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
// 5


//0(input)
//1
//2
//3
//3
//5

// 1(input)
// 1
// 2
// 0
// 3
// java.lang.ArithmeticException: / by zero
// 5

// 2(input)
// 1
// 2
// 2
// 3
// 5


// 3(input)
// 1
// 2
// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
// 5
// same output for all inputs 4,5,6..... and  -1,-2,-3......


//a (input)
// 1
// java.lang.NumberFormatException: For input string: "a"
// 5
//same for any non-numeric string

//here Exception in main is not printed because exception is handled by the try catch block
