public class K1 {
    
    class A {
        private int x = 50;
    }
    

    public static void main(String[] args) {
        System.out.println(new K1().new A().x);
    }
}
//means private members of the inner class are accessible to the members of the outer class