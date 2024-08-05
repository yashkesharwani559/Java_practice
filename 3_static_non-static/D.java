class D {
    static int a = 20;
    int b = 40;

    void pro() {
    };

    static void pra() {
    };

    void process() {
        a = 40;
        b = 35;
        pro();
        pra();
        // it will compile correctly without any error
        // because from a non-static method we can access both static and non-static variables in java
    }
}
