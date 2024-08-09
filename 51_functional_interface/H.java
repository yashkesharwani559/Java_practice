class H {
    public static void main(String[] args) {
        HH a = () -> System.out.println("hello");//functional interface

        a.por();
    }
}
//output
// hello

@FunctionalInterface
interface HH{
    void por();
}

