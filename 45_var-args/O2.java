public class O2 {
    public static void pro(String[] arr, String... x) {
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~");
        for (String s : x) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        pro(new String[] { "A", "B" }, "C", "D");// correct
    }
}

// A
// B
// ~~~~~~~~~~~~~~~~~~
// C
// D