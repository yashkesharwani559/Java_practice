class X4 {
    void pro() {
        System.out.println("pro in X4");
    }
}

class K extends X4 {
    void pro() {
        System.out.println("pro in D");
    }

    void info() {
        pro();//pro in D
        this.pro();//pro in D
        super.pro();//pro in X4
    }

    public static void main(String[] args) {
        K x = new K();
        x.info();
    }
}

