public class B {
    public static void main(String[] args){
        int[] x = new int[3];
        int[] y = new int[3];

        for (int a : x; int b : y){

        }
    }
}


//this will give compilation error as
// B.java:6: error: ')' expected
//         for (int a : x; int b : y){
//                       ^
// B.java:6: error: ';' expected
//         for (int a : x; int b : y){
//                              ^
// B.java:6: error: not a statement
//         for (int a : x; int b : y){
//                                 ^
// B.java:6: error: ';' expected
//         for (int a : x; int b : y){
//                                  ^
// 4 errors
// error: compilation failed

//this compilation error is because we cannot use enhanced for loop for iterating the two arrays at the same time
