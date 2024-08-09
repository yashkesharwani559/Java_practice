import java.util.Arrays;
 
public class R1 {
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
    }
}
//output
// mohan, zohan, gohan, 15, rohan, johan,
// ==============
// 15, gohan, johan, mohan, rohan, zohan,