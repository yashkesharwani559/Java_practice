public class C {
    C(int x, float y) {

    }

    public static void main(String[] args) {
        C x = new C('x', 34);
    }
}
// here this will give no error because char to int and int to float are
// implicitly convertibleitself by the compiler
