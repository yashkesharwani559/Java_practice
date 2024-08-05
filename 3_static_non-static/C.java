class C {
    int a;

    void pro() {
    };

    static int c;

    static void pra() {
    };

    static void are() {
        // static method can access static methods and static variables in java
        c = 20;
        pra();

        // a = 20;
        // pro();
        // static method cannot access non-static methods and non - static variables in
        // java
    }
    // C.java:17: error: non-static variable a cannot be referenced from a static
    // context
    // a = 20;
    // ^
    // C.java:18: error: non-static method pro() cannot be referenced from a static
    // context
    // pro();

}
