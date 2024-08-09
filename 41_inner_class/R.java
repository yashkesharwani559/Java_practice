public class R {
    class X1 {
        X1(){
            System.out.println("X1");
        }
    }

    static class X2 {
        X2() {
            System.out.println("X2");
        }
    }

    public static void main(String[] args) {
        X1 x1 = new R().new X1();
        X2 x2 = new X2();
        R.X2 x3 = new R.X2();
    }
}
// X1
// X2
// X2