public class N {
    public static void main(String... args) {//correct
        // because we can use var-args anywhere where we are using array and this is a valid signature of the main method
        System.out.println(args);
        System.out.println(args.length);
    }
}
// [Ljava.lang.String;@62150f9e
// 0