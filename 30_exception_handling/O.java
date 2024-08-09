public class O {

    public static void main(String[] args) {
        System.out.println("A");
        abc();
        System.out.println("A1");
    }

    static void abc(){
        System.out.println("B");
        mno();
        System.out.println("B1");
    }

    static void mno(){
        System.out.println("C");
        pqr();
        System.out.println("C1");
    }

    static void pqr() {
        System.out.println("D");
        
        String s = null;
        System.out.println(s.length());//here gives ArithmeticException and the program crashes

        System.out.println("D1");
    }

}

//output
// A
// B
// C
// D
// Exception in thread "main" java.lang.NullPointerException
//         at O.pqr(O.java:25)
//         at O.mno(O.java:17)
//         at O.abc(O.java:11)
//         at O.main(O.java:5)