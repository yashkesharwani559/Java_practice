public class H {
    public static void main(String[] args){
        byte b = 67;
        // pro(12, 56, 78);//compilation fail
        pro((byte)12, (byte)56, (byte)78);//correct
    }
    static void pro(byte... x){
        System.out.println(x);
    }
}
//this is giving compilation error which means that first java is creating an array of int and then it is passed as argument in the pro() method 
// because if it is not like that then we know that in java typecasting from int to byte, short, char are exempted means java does them implicitly

// .java:4: error: method pro in class H cannot be applied to given types;
//         pro(12, 56, 78);//compilation fail
//         ^
//   required: byte[]
//   found: int,int,int
//   reason: varargs mismatch; possible lossy conversion from int to byte
// 1 error
// error: compilation failed