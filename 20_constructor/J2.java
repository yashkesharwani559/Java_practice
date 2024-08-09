class A {
    A(int x) {
        System.out.println(x);
    }

    A(int x, int y) {
        this(x);
        System.out.println(y);
    }

    A(int x, int y, int z) {
        this(x, y);
        System.out.println(z);
    }
}

public class J2 {
    public static void main(String[] args) {
        A x = new A(23, 23, 23);
    }
}

//this() call is used to access a constructor inside another constructor

