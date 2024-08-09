public class L {
    private int x = 45;
    private static int y = 34;

    static class X {
        void pro(){
            // System.out.println(x);//incorrect //not allowed
            System.out.println(y);//correct
        }
    }
}
// here the inner class is marked static but it doesn't mean that we have made the class static but it only means that the behavior of the class becomes like static method to access the members of the class.