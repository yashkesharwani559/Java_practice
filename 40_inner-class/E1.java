public class E1 {
    class FF {
        FF() {
            System.out.println("FF");
        }
    }

    public static void main(String[] args) {

        // case 2:
        FF f = new E1().new FF();//below two lines in one line

        // case 1:
        // E1 e = new E1();
        // FF f = e.new FF();

    }
}
//output
// FF