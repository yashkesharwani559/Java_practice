class H2 {
    public static void main(String[] args) {

        HH2 a = (x, y) -> System.out.println("hello" + (x + y));// functional interface
        
        a.por(23, 22);

    }
}
// output
// hello45

@FunctionalInterface
interface HH2 {
    void por(int x, int y);
}
