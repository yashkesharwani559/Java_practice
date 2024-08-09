public class W2 {
    public static void main(String[] args){
        long l = 34;
        double d = 12.45;
        float f = 34.56f;

        // int[] a = {l, d, f, 123.45, 123.45f};
    }
}
//this will give compilation error as
// W2.java:7: error: incompatible types: possible lossy conversion from long to int
//         int[] a = {l, d, f, 123.45, 123.45f};
//                    ^
// W2.java:7: error: incompatible types: possible lossy conversion from double to int
//         int[] a = {l, d, f, 123.45, 123.45f};
//                       ^
// W2.java:7: error: incompatible types: possible lossy conversion from float to int
//         int[] a = {l, d, f, 123.45, 123.45f};
//                          ^
// W2.java:7: error: incompatible types: possible lossy conversion from double to int
//         int[] a = {l, d, f, 123.45, 123.45f};
//                             ^
// W2.java:7: error: incompatible types: possible lossy conversion from float to int
//         int[] a = {l, d, f, 123.45, 123.45f};
//                                     ^
// 5 errors
// error: compilation failed
