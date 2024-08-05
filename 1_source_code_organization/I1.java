class I1 {
    static I1 i;// this is a correct syntax
    // so object reference variable can be directly declared inside class and can be
    // marked as static
    // default value
    static boolean a;// false
    static char b;// '\u0000'
    static short c;// 0
    static byte d;// 0
    static int e;// 0
    static long f;// 0
    static float g;// 0.0
    static double h;// 0.0
    static String s;// null
    // java has the power to run another class file on same folder when it is called
    

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(s);
        System.out.println(e);// I@7bfcd12c --> this will print for this line
        // where first word I is class name and after it @ and then hexadecimal code of
        // the address of the object reference variable as where it is stored

        System.out.println((int) b);// prints 0// this is a correct syntax for explicit typecasting
        // because unicodre character '\u0000' is equal to 0 of integer but if we
        // directly print '\u0000' then it will print space ' '
        // and if we print ' ' space after typecasting to integer it will print 32
        System.out.println((int) ' ');
        // System.out.println(e.b(int));//this will give compilation error
    }

}
