public class A1 {
    static void pro(int a, int b){
        
    }
    public static void main(String[] args){
        pro(12);//compilation fail
    }
}

// A1.java:6: error: method pro in class A1 cannot be applied to given types;
//         pro(12);//compilation fail
//         ^
//   required: int,int
//   found: int
//   reason: actual and formal argument lists differ in length
// 1 error
// error: compilation failed