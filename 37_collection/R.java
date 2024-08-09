import java.util.Arrays;
 
public class R {
    public static void main(String[] args) {
        
        int[] x = {3, 3454, 56, 92, 12, 90, 25};

        for(int a : x){
            System.out.print(a + ", ");
        }
        System.out.println("\n==============");
        Arrays.sort(x);
        
        for(int a : x){
            System.out.print(a + ", ");
        }
    }
}

//Arrays is a class in the java.util package that has all the methods and properties are static. Here in the Arrays class there is no constructor in it

// sort(array )-> it takes array of primitives as argument and it returns void and it sorts the array and store that new array in the same array

//output
// 3, 3454, 56, 92, 12, 90, 25,
// ==============
// 3, 12, 25, 56, 90, 92, 3454,