public class I1 {
    public static void main(String[] args) {
        
        System.out.println(1);
        try{
            int i = Integer.parseInt(args[0]);
            System.out.println(2);
            int[] x = {3, 0, 2};
            System.out.println(x[i]);
            System.out.println(3);
            int y = 12/x[i];
        }catch(ArithmeticException e){
            System.out.println("AE");
        } 
        catch(NumberFormatException e){
            System.out.println("NFE");
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("AIOBE");
        } 
        System.out.println(5);

    }
}

//input - output

// nothing
//1
// AIOBE
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
// AE
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
// AIOBE
// 5

// same output for all inputs 4,5,6..... and  -1,-2,-3......


//a (input)
// 1
// NFE
// 5

//same output for any non-numeric string