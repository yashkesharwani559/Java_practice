public class G1 {
    public static void main(String[] args) {

        XG1 x1 = XG1.getInstance();
        XG1 x2 = XG1.getInstance();
        XG1 x3 = XG1.getInstance();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

    }
}

class XG1 {
    private static XG1 y;

    private XG1() {

    }

    private XG1(int x) {

    }

    public static XG1 getInstance() {
        y = new XG1();
        return y;
        // here it always returns a new object of the XG1 class
    }
}