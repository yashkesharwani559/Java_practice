public class D2 {
    public static void main(String[] args) {
        B x = new B();
        x.pro();
    }
}

class A {
    int x = 45;
}

interface C {
    int x = 345;
}

class B extends A implements C {
    // int x = 46;

    void pro() {
        System.out.println(x);
    }
}

// this will give compilation error as
// D2.java:20: error: reference to x is ambiguous
//         System.out.println(x);
//                            ^
//   both variable x in A and variable x in C match
// 1 error
// PS D:\New fo
