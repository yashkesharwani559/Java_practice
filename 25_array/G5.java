public class G5 {
    public static void main(String[] args){
        int[][] x = new int[3][];

        x[0] = new int[] { 21, 34, 56, 67 };//this is a valid code
        
        // x[1]={1,32,45,56};//this will give compilation error as
        
    }
}

// G5.java:7: error: illegal start of expression
//         x[1]={1,32,45,56};//this will give compilation error as
//              ^
// G5.java:7: error: not a statement
//         x[1]={1,32,45,56};//this will give compilation error as
//               ^
// G5.java:7: error: ';' expected
//         x[1]={1,32,45,56};//this will give compilation error as
//                ^
// 3 errors
// error: compilation failed