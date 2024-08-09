public class G1 {
    public static void main(String[] args) {
        int[][] x = new int[][] { new int[3], new int[0], new int[6] };
        
        for(int[] a : x){
            System.out.println(a.length);
        }
    }
}

//output
// 3
// 0
// 6
