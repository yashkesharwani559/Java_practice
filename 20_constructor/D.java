public class D {
    D() {

    }

    public static void main(String[] args) {
        D a = new D();
    }
}
// this will give no error message but the constructor doesnot have return type
// but if we mark the retyrn type on the constructor then that constructor will
// behave like a method
