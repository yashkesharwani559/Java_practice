public class H1 {
    public static void main(String[] args){
        short b = 67;
        pro(12, 56, 78);//compilation fail
        pro((short)12, (short)56, (short)78);//correct
    }
    static void pro(short... x){
        System.out.println(x);
    }
}

// H1.java:4: error: method pro in class H1 cannot be applied to given types;
//         pro(12, 56, 78);//compilation fail
//         ^
//   required: short[]
//   found: int,int,int
//   reason: varargs mismatch; possible lossy conversion from int to short
// 1 error
// error: compilation failed