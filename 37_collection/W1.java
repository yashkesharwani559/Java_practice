import java.util.Arrays;
import java.util.List;


public class W1 {
    public static void main(String[] args){
        Integer[] x = {34, 57, 89, 98};

        for (int a : x) {
            System.out.print(a + "   ,  ");
        }
        
        List<Integer> list = Arrays.asList(x);
        
        System.out.println("\n" + list);
        
        // x[4] = 55;//ArrayIndexOutOfBoundsException
        x[0] = 100; //will work without any difficulty

        System.out.println(list);

        for (int a : x) {
            System.out.print(a+"   ,  ");
        }



    }
}
//asList(array) -> it is a static method in the Arrays class that returns the object of subclass of the List interface. Here it originally returns the object of the ArrayList class that is the private static inner class of the Arrays class. And it is present in java.util.Arrays.ArrayList but since it is private you can't access it privately

// 34   ,  57   ,  89   ,  98   ,
// [34, 57, 89, 98]
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//         at W1.main(W1.java:17)