class H1 {
    public static void main(String[] args) {

        // HH1 a = (b) -> System.out.println("hello" + b);//functional interface
        HH1 a = b -> System.out.println("hello" + b);// functional interface //same as above

        a.por(45);

    }
}
// output
// hello45

@FunctionalInterface
interface HH1 {
    void por(int x);
}
