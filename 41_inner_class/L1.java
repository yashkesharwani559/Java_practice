public class L1 {
    static int x = 45;
    private static int y = 34;

    static void pro() {
        class X {
            void pro() {
                System.out.println(x);
                System.out.println(y);
            }
        }
        new X().pro();
    }

    public static void main(String[] args){
        L1.pro();
    }
}

//output
// 45
// 34