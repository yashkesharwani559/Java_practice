import java.util.Arrays;
 
public class U {
    public static void main(String[] args) {
        
        String[] x = {"mohan", "zohan", "gohan", "15", "rohan", "johan"};

        for(String a : x){
            System.out.print(a + ", ");
        }
        System.out.println("\n==============");
        Arrays.sort(x);
        
        for(String a : x){
            System.out.print(a + ", ");
        }

        // int searchIndex = Arrays.binarySearch(x, "15");//0
        int searchIndex = Arrays.binarySearch(x, "eohan");//-2  //negative because "eohan" is not present in the string and if elment is not present then it returns the -(insertionIndex + 1)

        System.out.println("\n"+searchIndex);

    }
}