public class T {

    static GG1 g = new GG1() {//here the no parameterized constructor of the GG1 class is called

    };

    public static void main(String[] args) {
        System.out.println(g);
    }
}

class GG1 {
    GG1() {
        System.out.println("Hello");
    }
    GG1(int x) {
        System.out.println("Hiii");
    }
}