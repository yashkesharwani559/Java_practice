public class P {
    public static void main(String[] args) {
        int[][][] x = new int[2][3][2];

        // System.out.println(x instanceof int[][][]);//true
        // System.out.println(x[0] instanceof int[][]);//true
        // System.out.println(x[0][0] instanceof int[]);//true
        //all above wil;l not give any compilation error 


        // System.out.println(x[0][0][0] instanceof int);//this will give compilation error
        
    }
}
//compilation error as
//     O2.java:8: error: unexpected type
//         System.out.println(x[0][0][0] instanceof int);
//                                   ^
//   required: reference
//   found:    int
// O2.java:8: error: unexpected type
//         System.out.println(x[0][0][0] instanceof int);
//                                                  ^
//   required: class or array
//   found:    int
// 2 errors
// error: compilation failed