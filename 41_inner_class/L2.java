public class L2 {
    int x = 45;
    private static int y = 34;

    void pro() {
        class X {
            void pro() {
                System.out.println(x);
                System.out.println(y);
            }
        }
        new X().pro();
    }

    public static void main(String[] args){
        new L2().pro();
    }
}
//output
// 45
// 34