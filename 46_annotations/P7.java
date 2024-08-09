public class P7 {
    public static void main(String[] args) {
        PP7.main();
    }
}
//now this will generate a warning because now the main() method of the PP7 is called from other code.

class PP7 {
    @Deprecated
    public static void main(String... args){
        System.out.println("hello");
    }
}