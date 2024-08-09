class H1 {

    public static void main(String[] args) {
        boolean b = true;
        char c = 'A';
        byte bt = 14;
        short s = 45;
        int i = 67;
        long l = 90;
        float f = 89.23f;
        double d = 12.12;
        XYZ a1 = new XYZ();
        MNO a2 = new XYZ();
        PQR a3 = new XYZ();
        int[] a4 = new int[3];

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

class XYZ extends MNO implements PQR {  }

abstract class MNO { }

interface PQR { }

//output as
// boolean variable: true
// char variable: 65
// byte variable: 14
// short variable: 45
// int variable: 67
// long variable: 90
// float variable: 89.23
// double variable: 12.12
// class XYZ variable: XYZ@d70c109
// abstract class MNO variable: XYZ@17ed40e0
// interface PQR variable: XYZ@50675690
// int[] variable: [I@3ac42916