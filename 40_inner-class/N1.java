public class N1 {
    
    int x = 45;
    class X {

    }
    public static void main(String[] args){
        X x = new N1().new X();
        // System.out.println(x.x);//compilation fail
        System.out.println(new N1().x);//allowed
    }
}