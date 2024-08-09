import java.util.Arrays;
 
public class T {
    public static void main(String[] args) {
        
        int[] x = {3, 3454, 56, 92, 12, 90, 25};

        for(int a : x){
            System.out.print(a + ", ");
        }
        System.out.println("\n==============");
        // int searchIndex = Arrays.binarySearch(x, 12);//it gives unexpected result because array is not sorted  /-2
        int searchIndex = Arrays.binarySearch(x, 90);//-2
        
        for(int a : x){
            System.out.print(a + ", ");
        }
        System.out.println("\n" +searchIndex);
    }
}