class H {

    public static void main(String[] args) {
        boolean b;
        char c;
        byte bt;
        short s;
        int i;
        long l;
        float f;
        double d;
        XYZ a1;
        MNO a2;
        PQR a3;
        int[] a4;

        System.out.println("boolean variable: " + b);
        System.out.println("char variable: " + (int)c);
        System.out.println("byte variable: " + bt);
        System.out.println("short variable: " + s);
        System.out.println("int variable: " + i);
        System.out.println("long variable: " + l);
        System.out.println("float variable: " + f);
        System.out.println("double variable: " + d);
        System.out.println("class XYZ variable: " + a1);
        System.out.println("abstract class MNO variable: " + a2);
        System.out.println("interface PQR variable: " + a3);
        System.out.println("int[] variable: " + a4);
    }
}

class XYZ {  }

abstract class MNO { }

interface PQR { }



// H.java:17: error: variable b might not have been initialized
//         System.out.println("boolean variable: " + b);
//                                                   ^
// H.java:18: error: variable c might not have been initialized
//         System.out.println("char variable: " + (int)c);
//                                                     ^
// H.java:19: error: variable bt might not have been initialized
//         System.out.println("byte variable: " + bt);
                                               ^
// H.java:20: error: variable s might not have been initialized
//         System.out.println("short variable: " + s);
//                                                 ^
// H.java:21: error: variable i might not have been initialized
//         System.out.println("int variable: " + i);
//                                               ^
// H.java:22: error: variable l might not have been initialized
//         System.out.println("long variable: " + l);
//                                                ^
// H.java:23: error: variable f might not have been initialized
//         System.out.println("float variable: " + f);
//                                                 ^
// H.java:24: error: variable d might not have been initialized
//         System.out.println("double variable: " + d);
//                                                  ^
// H.java:25: error: variable a1 might not have been initialized
//         System.out.println("class XYZ variable: " + a1);
//                                                     ^
// H.java:26: error: variable a2 might not have been initialized
//         System.out.println("abstract class MNO variable: " + a2);
//                                                              ^
// H.java:27: error: variable a3 might not have been initialized
//         System.out.println("interface PQR variable: " + a3);
//                                                         ^
// H.java:28: error: variable a4 might not have been initialized
//         System.out.println("int[] variable: " + a4);
//                                                 ^
// 12 errors