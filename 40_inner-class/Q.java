public class Q {
    class X{
        int h = 45;
        void pro(){
            int h = 39;
            System.out.println(h);
            System.out.println(this.h);
        }
    }
    public static void main(String[] args){
        X x = new Q().new X();
        x.pro();
    }
}
//output
// 39
// 45