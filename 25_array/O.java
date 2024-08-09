public class O {
    public static void main(String[] args){
        int[][][] x = new int[2][3][2];

        System.out.println(x instanceof int[][][]);//true
        //no compilation error and prints true as output

        
        System.out.println(x instanceof int[][]);


        System.out.println(x instanceof int[]);

    }
}
//this both two at line no. 9 and 12 give compilation error as
// O.java:9: error: incompatible types: int[][][] cannot be converted to int[][]
//         System.out.println(x instanceof int[][]);
//                            ^
// O.java:12: error: incompatible types: int[][][] cannot be converted to int[]
//         System.out.println(x instanceof int[]);
//                            ^
// 2 errors
// error: compilation failed