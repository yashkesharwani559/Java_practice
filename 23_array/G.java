public class G {
    public static void main(String[] args) {
        abc();
    }

    static void abc() {
        def();
    }

    static void def() {
        mno();
    }

    static void mno() {
        pqr();
    }

    static void pqr() {
        xyz();
    }

    static void xyz() {
        int y = 12 / 0;
    }

}


// this will give exception as
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at G.xyz(G.java:23)
//         at G.pqr(G.java:19)
//         at G.mno(G.java:15)
//         at G.def(G.java:11)
//         at G.abc(G.java:7)
//         at G.main(G.java:3)

//this above is called stack trace that is generated in the terminal when a problem at runtime comes then the terminal gives all the list of methods that are in the stack with their sequence