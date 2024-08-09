public class P4 {
    @Deprecated
    public static void main(String[] args) {
        System.out.println("hello");
    }//here this is not generating any warning
    // this is because main() method is directly called by the JRE and not by the compiler.
}
