public class D extends DD {
    @Override
    void process() {
        System.out.println("Hii ");
    }

    public static void main(String[] args) {
        DD d = new D();
        d.process();//Hii
    }
}

class DD {
    void process() {
        System.out.println("Hello");
    }
}