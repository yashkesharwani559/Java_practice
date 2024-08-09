public class E1 {
    static boolean[] b = new boolean[3];
    static char[] c = new char[3];
    static byte[] bt = new byte[3];
    static short[] s = new short[3];
    static int[] i = new int[3];
    static long[] l = new long[3];
    static float[] f = new float[3];
    static double[] d = new double[3];
    static A[] a = new A[3];
    static B[] bb = new A[3];
    static C[] cc = new A[3];
 
    public static void main(String[] args) {
        System.out.println(b);
        System.out.println(c);
        System.out.println(bt);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(a);
        System.out.println(bb);
        System.out.println(cc);
    }
}

class A extends B implements C{
    
}

abstract class B {
    
}

interface C {
    
}


// output:
// [Z@4a94ee4

// [B@4cc451f2
// [S@6379eb
// [I@294425a7
// [J@67d48005
// [F@9f116cc
// [D@12468a38
// [LA;@1aa7ecca
// [LA;@59309333
// [LA;@5876a9af