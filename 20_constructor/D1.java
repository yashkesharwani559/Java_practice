public class D1 {
    void D1(int y) {

    }

    public static void main(String[] args) {
        D1 d = new D1();
        d.D1(23);
    }
}
// this will give no error message the constructor that we have created is
// marked a return type and that's why it appears as a method and so the default
// constructor is supplied by thecompiler
