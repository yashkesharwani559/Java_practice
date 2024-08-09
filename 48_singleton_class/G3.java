public class G3 {
    public static void main(String[] args) {

        XG3 x1 = XG3.getInstance();
        XG3 x2 = XG3.getInstance();
        XG3 x3 = XG3.getInstance();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

    }
}

class XG3 {
    private static XG3 y;
    private XG3() {

    }

    private XG3(int x) {

    }

    //lazy initialization because here we are creating the object only when it is asked to return.

    public static XG3 getInstance() {

        if (y == null)
            y = new XG3();

        return y;
    }
    //now this will return the same object everytime. This happened because, when first time this method is called then null is stored in y and now this will create a new object and then return it and after that if that method is again called, then this will return the same object
}
