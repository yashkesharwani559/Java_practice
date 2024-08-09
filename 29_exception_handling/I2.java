public class I2 {
    public static void main(String[] args) {
        System.out.println(1);
        
        try{
            System.out.println(2);
            int x = Integer.parseInt(args[0]);
            System.out.println(3);
        }catch(NumberFormatException e){
            System.out.println("NFE");
        }
        System.out.println(4);
    }
}

//input - output

//nothing (input)
//1
//2
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        // at I2.main(I2.java:7)

//this program terminates because there is no catch for the ArrayIndexOutOfBoundsException


//0 (input)
// 1
// 2
// 3
// 4

// same output for any numeric string 

//a(input)
// 1
// 2
// NFE
// 4