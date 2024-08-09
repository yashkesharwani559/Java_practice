class M {
    public static void main(String[] args) {
        MA.MAA a = () -> System.out.println("hello");

        a.pro();// hello

    }
}

abstract class MA {
    int a = 567;

    abstract void pro();

    @FunctionalInterface
    interface MAA {
        void pro();
    }
}