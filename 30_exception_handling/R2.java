public class R2 {
    public static void main(String[] args) {
        pro();
    }

    static void pro() {
        System.out.println(1);
        return;
        System.out.println(2);
    }
}

//compilation fail because line no 9 never runs

//compilation error as
// R2.java:9: error: unreachable statement
//         System.out.println(2);
//         ^
// 1 error
// error: compilation failed
