public class V3 {
    public static void main(String[] args) {

        AX a = new BX();

        a.pro(new int[]{13, 67, 90});//hello
    }
}


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
