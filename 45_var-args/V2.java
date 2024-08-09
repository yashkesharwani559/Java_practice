public class V2 {
    public static void main(String[] args) {

        AX a = new BX();

        a.pro(13, 67, 90);//hello
    }
}
//output
// hello 


class AX {
    void pro(int... x) {
        System.out.println("hii");
    }
}

class BX extends AX {
    void pro(int[] x) {
        System.out.println("hello");
    }
}
