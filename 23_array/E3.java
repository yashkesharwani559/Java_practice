public class E3 {
    boolean[] b;
    char[] c ;
    byte[] bt;
    short[] s;
    int[] i ;
    long[] l ;
    float[] f ;
    double[] d ;
    A[] a ;
    B[] bb ;
    C[] cc ;
 
    public static void main(String[] args) {
        E3 x = new E3();
        System.out.println(x.b);
        // System.out.println(x.c);
        System.out.println(x.bt);
        System.out.println(x.s);
        System.out.println(x.i);
        System.out.println(x.l);
        System.out.println(x.f);
        System.out.println(x.d);
        System.out.println(x.a);
        System.out.println(x.bb);
        System.out.println(x.cc);
    }
}

class A extends B implements C{
    
}

abstract class B {
    
}

interface C {

}
//gives error at line 17 in case of the char array reference variable only

// output when the line  17 is commented
// null
// null
// null
// null
// null
// null
// null
// null
// null
// null