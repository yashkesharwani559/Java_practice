public class G3 {
    public static void main(String[] args){
        int[][] x = new int[][]{{3, 5, 6}, {7, 8 ,10}, {39, 49, 69}};

        System.out.println(x.length);

        for(int[] a : x)
        System.out.println(a.length);
    }
}
//output
// 3
// 3
// 3
// 3
