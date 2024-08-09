public class H2 {
    public static void main(String[] args) {
        char b = 67;
        pro(12, 56, 78);// compilation fail
        pro((char) 12, (char) 56, (char) 78);// correct
    }

    static void pro(char... x) {
        System.out.println(x);
    }
}
// H2.java:4: error: method pro in class H2 cannot be applied to given types;
//         pro(12, 56, 78);// compilation fail
//         ^
//   required: char[]
//   found: int,int,int
//   reason: varargs mismatch; possible lossy conversion from int to char
// 1 error
// error: compilation failed