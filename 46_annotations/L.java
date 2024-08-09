@SuppressWarnings("deprecation")
public class L {

    public static void main(String[] args) {

        Integer i = new Integer(63);

        System.out.println(i);

        Integer i1 = new Integer(91);

        System.out.println(i1);

        pro();
    }

    static void pro() {

        Integer i = new Integer(23);

        System.out.println(i);

        Integer i1 = new Integer(13);

        System.out.println(i1);
    }
}
//here we have directly used @SuppressWarnings("deprecation") on the class
// no warning
// output
// 63
// 91
// 23
// 13