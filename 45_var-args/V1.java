public class V1 {
    public static void main(String[] args) {

        AX a = new BX();

        a.pro(13, 67, 90);//compiation fail 
        // because compiler checks the type and AX class has int[] array parameterized constructor and int can't be converted int[]

    }
}
// V1.java:6: error: method pro in class AX cannot be applied to given types;
//         a.pro(13, 67, 90);//compiation fail
//          ^
//   required: int[]
//   found: int,int,int
//   reason: actual and formal argument lists differ in length
// 1 error
// error: compilation failed


class AX {
    void pro(int[] x) {
        System.out.println("hii");
    }
}

class BX extends AX {
    void pro(int... x) {
        System.out.println("hello");
    }
}
