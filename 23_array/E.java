public class E {
    boolean[] b = new boolean[3];
    char[] c = new char[3];
    byte[] bt = new byte[3];
    short[] s = new short[3];
    int[] i = new int[3];
    long[] l = new long[3];
    float[] f = new float[3];
    double[] d = new double[3];
    A[] a = new A[3];
    B[] bb = new A[3];
    C[] cc = new A[3];
 
    public static void main(String[] args) {
        E x = new E();
        System.out.println(x.b);
        System.out.println(x.c);
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

//output: 
// [Z@7b9a4292

// [B@4a94ee4
// [S@4cc451f2
// [I@6379eb
// [J@294425a7
// [F@67d48005
// [D@9f116cc
// [LA;@12468a38
// [LA;@1aa7ecca
// [LA;@59309333