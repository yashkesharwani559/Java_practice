public class S1 {
    static GG1 g = new GG1() {
        void GG1() {
            System.out.println(12);
        }
    };//correct //anonymous inner class
    public static void main(String[] args){
        // g.GG1();//not allowed
        System.out.println(g);
    }
}

class GG1 {
    GG1() {
        System.out.println("Hello");
    }
    GG1(int x) {
        System.out.println("Hello");
    }
}
// S1.class
// S1$1.class
// GG1.class