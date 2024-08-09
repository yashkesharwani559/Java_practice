public class E {
    class X implements AAX {
        public void pro() {
            System.out.println(this);//E$X@<hex-code>
        }
    }

    public static void main(String[] args) {
        X x = new E().new X();
        x.pro();
        System.out.println(x);//E$X@<hex-code>
    }
}

interface AAX {
    void pro();
}
