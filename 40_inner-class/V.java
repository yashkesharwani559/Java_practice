class AAAA {
    int x = 45;

    void info(){
        System.out.println("info");
    }

    class X {
        private int x = 45;
        int y = 45;
        void pro(){
            System.out.println("hello");
        }
    }
}

public class V extends AAAA {
    void mno() {
        X x = new X();
       x.pro();
       System.out.println(x.y);
    //    System.out.println(x.x);//not allowed because private members are not accessible to the child class
    }

    
    public static void main(String[] args) {
        V a = new V();
        System.out.println(a.x);
        a.info();
        X x = a.new X();//inherit
        x.pro();

        // System.out.println(x.x);//not allowed because private members of parent class are not accessible to the child class
        System.out.println(x.y);
    }
}
// means the inner class of parent class is accessible to the child class