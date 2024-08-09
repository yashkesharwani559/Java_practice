public class C {
    class X {
        private int x = 45;
        int y = 67;
    }
    void info(){
        X x = new X();
        System.out.println(x.x);//45
        System.out.println(x.y);//67
    }
    public static void main(String[] args){
        new C().info();
        // new C().new X().x;//not allowed because x is private
    }
}
