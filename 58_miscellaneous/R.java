public class R {
    private static int r = 40;
    {
        r = 10;
    }

    static {
        r = 60;
    }
    {
        r = 50;
    }

    public static void main(String[] args) {
        System.out.println(R.r);

        R rt = new R();

        R.r = 20;

        rt = new R();
        System.out.println(R.r);

    }
}
