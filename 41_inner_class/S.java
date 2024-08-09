public class S {
    GG g = new GG() {
        void GG() {
            System.out.println(12);
        }
    };//correct //anonymous inner class
    public static void main(String[] args){
        
    }
}

class GG {
    GG() {
        System.out.println("Hello");
    }
    GG(int x) {
        System.out.println("Hello");
    }
}