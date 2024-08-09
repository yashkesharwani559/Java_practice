public class V {
    public static void main(String[] args) {

        AX a = new BX();

        a.pro(new int[] { 13, 67, 90 });//hello
        // means here if the parent class method has an array and the child class method have a same var-args then the child class method will run means dynamic method dispatch will occur
        
    }
}

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
