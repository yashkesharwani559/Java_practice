public class O {
    class X {
        int x = 45;
    }
    public static void main(String[] args){
        O o = new O();
        X x = o.new X();

        System.out.println(o.x);//compilation fail

    }
}
//because outer class object can't access the members of the inner class