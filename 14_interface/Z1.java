class Z1 {
    public static void main(String[] args) {
        Z12.pro();
    }
}


interface Z11 {
    int x = 45;
}

interface Z12 extends Z11 {
    int x = 67;

    static void pro() {
        System.out.println(x);
        // System.out.println(super.x);//compilation fail
        System.out.println(Z11.x);
    }
}

// output
// 67
// 45