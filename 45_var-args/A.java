class A {
    static void pro(int a, int b) {
        System.out.println("hello");
    }
    public static void main(String[] args){
        pro();//compilation fail
    }
}
// A.java:6: error: method pro in class A cannot be applied to given types;
//         pro();//compilation fail
//         ^
//   required: int,int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
// error: compilation failed