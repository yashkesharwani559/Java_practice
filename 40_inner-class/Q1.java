public class Q1 {
    int x = 45; 

    class X {
        int x = 67;

        void pro() {
            int x = 90;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Q1.this.x);
            System.out.println(y);
        }
    }
    int y = 79;
    public static void main(String[] args){
        X x = new Q1().new X();

        x.pro();
    }
}
//output
// 90
// 67
// 45
// 79