public class L2 {
    static void pro(int... x, float y){

    }
    public static void main(String[] args){
        pro(23, 23, 45, 5.6);
    }
}
//compilation fail because var arg should be used at the last

// L2.java:2: error: varargs parameter must be the last parameter
//     static void pro(int... x, float y){
//                            ^
// 1 error
// error: compilation failed