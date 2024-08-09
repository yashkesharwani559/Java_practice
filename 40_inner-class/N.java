public class N {
    int x = 45;

    class X {

    }
    public static void main(String[] args){
        X x = new N().new X();
        System.out.println(x.x);//compilation fail
    }
}
//because the members of outer class are accessible inside the inner class but the object of inner class can only access the members of the inner class and can't access the members of the outer class