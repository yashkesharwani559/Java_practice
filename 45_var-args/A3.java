public class A3 {
    static void pro(int a, int b){
        
    }
    public static void main(String[] args){
        int[] a = {34, 56, 678};
        pro(a);//compilation fail
    }
}
// A3.java:7: error: method pro in class A3 cannot be applied to given types;
//         pro(a);//compilation fail
//         ^
//   required: int,int
//   found: int[]
//   reason: actual and formal argument lists differ in length
// 1 error
// error: compilation failed