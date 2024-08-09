public class O1 {
    public static void main(String[] args) {
        int[][][] x = new int[2][3][2];

        System.out.println(x[0] instanceof int[][]);//true
        // this is the only valid code and that's why it will not give any compilation error and print output as true



        // System.out.println(x[0] instanceof int[][][]);// this will compilation error
        // as
        // O1.java:9: error: incompatible types: int[][] cannot be converted to
        // int[][][]
        // System.out.println(x[0] instanceof int[][][]);//this will compilation error
        // as
        // ^
        // 1 error
        // error: compilation failed



        // System.out.println(x[0] instanceof int[]);// this will compilation error as
        // O1.java:19: error: incompatible types: int[][] cannot be converted to int[]
        // System.out.println(x[0] instanceof int[]);// this will compilation error as
        // ^
        // 1 error
        // error: compilation failed



        // System.out.println(x[0] instanceof int);// this will compilation error as
        // O1.java:27: error: unexpected type
        // System.out.println(x[0] instanceof int);// this will compilation error as
        // ^
        // required: class or array
        // found: int
        // 1 error
        // error: compilation failed


    }
}
