public class O1 {
    class X {
        int x = 45;
    }
    public static void main(String[] args){
        O1 o = new O1();
        X x = o.new X();

        // System.out.println(o.x);//compilation fail
        System.out.println(x.x);//allowed
    }
}