
@FunctionalInterface
interface C4{
    void pro();

    default void mno() {
        System.out.println("hello");
    }
    static void pqr(){
        System.out.println("hii");
    }

    private void abc() {
        System.out.println("abc");
    }
}
//correct