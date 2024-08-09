public class G1 {
    public static void main(String[] args){
        
        byte b = 45;
        short s = 23;
        char c = 'A';
        int i = 67;
        long l = 678l;

        pro(b, s, c, i, l);//compilation error because long can't be implecitly typecast to int
    }
    static void pro(int... a){
        for(int x : a){
            System.out.println(x);
        }
    }
}
// G1.java:10: error: method pro in class G cannot be applied to given types;
//         pro(b, s, c, i, l);//compilation error because long can't be implecitly typecast to int
//         ^
//   required: int[]
//   found: byte,short,char,int,long
//   reason: varargs mismatch; possible lossy conversion from long to int
// 1 error
// error: compilation failed