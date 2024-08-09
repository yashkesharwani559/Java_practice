public class I3 {
    public static void main(String[] args) {
        
        System.out.println(1);
        try{
            int i = Integer.parseInt(args[0]);
            System.out.println(2);
            int[] x = {3, 0, 2};
            System.out.println(x[i]);
            System.out.println(3);
            String s = null;
            System.out.println(s.length());
            System.out.println(4);
            int y = 12/x[i];
            System.out.println(4);
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

//2 (input), 0, 1, 
// 1
// 2
// 2
// 3
// Exception in thread "main" java.lang.NullPointerException
//         at I3.main(I3.java:12)

//nothing (input)
//1
// AIOBE
//5

//3 (input)
// 1
// 2
// AIOBE
// 5

//a (input)(any non-numeric string)
//1
//NFE
//5

