public class A2 {
    static void pro(int a,int b){
        
    }
    public static void main(String[] args){
        pro(12, 15, 67);//compilation fail
    }
}

// A2.java:6: error: method pro in class A2 cannot be applied to given types;
//         pro(12, 15, 67);//compilation fail
//         ^
//   required: int,int
//   found: int,int,int
//   reason: actual and formal argument lists differ in length
// 1 error
// error: compilation failed