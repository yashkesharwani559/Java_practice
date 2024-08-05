class I {
    static I i;// this is a correct syntax
    // so object reference variable can be directly declared inside class and can be
    // marked as static
    // default value
    boolean a;// false
    char b;// '\u0000'
    short c;// 0
    byte d;// 0
    int e;// 0
    long f;// 0
    float g;// 0.0
    double h;// 0.0
    String s;// null

    public static void main(String[] args) {
        I e = new I();
        System.out.println(e.a);
        System.out.println(e.b);
        System.out.println(e.c);
        System.out.println(e.d);
        System.out.println(e.e);
        System.out.println(e.f);
        System.out.println(e.g);
        System.out.println(e.h);
        System.out.println(i);
        System.out.println(e.s);
        System.out.println(e);// I@7bfcd12c --> this will print for this line
        // where first word I is class name and after it @ and then hexadecimal code of
        // the address of the object reference variable as where it is stored

        System.out.println((int) e.b);// prints 0// this is a correct syntax for explicit typecasting
        // because unicodre character '\u0000' is equal to 0 of integer but if we
        // directly print '\u0000' then it will print space ' '
        // and if we print ' ' space after typecasting to integer it will print 32
        System.out.println((int) ' ');
        // System.out.println(e.b(int));//this will give compilation error
    }

}
