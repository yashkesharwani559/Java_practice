public class G2 {
    public static void main(String[] args) {

        XG2 x1 = XG2.getInstance();
        XG2 x2 = XG2.getInstance();
        XG2 x3 = XG2.getInstance();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

    }
}

class XG2 {
    private final static XG2 y;//compilation fail because the static final variable must initialized with declaration or inside the static block.

    private XG2() {

    }

    private XG2(int x) {

    }

    public static XG2 getInstance() {
        return y;
        // here it always returns a new object of the XG2 class
    }
}

// G2.java:20: error: variable y might not have been initialized
//     }
//     ^
// G2.java:24: error: variable y might not have been initialized
//     }
//     ^
// 2 errors
// error: compilation failed