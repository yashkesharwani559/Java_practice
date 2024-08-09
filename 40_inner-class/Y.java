public class Y {
    void pro() {
        class XX {

        }
    }

    void mno() {
        XX x;//compilation fail
    }

    public static void main(String[] args) {
        XX x;
    }
}
//this is because the method local inner class is accessible locally only

// Y.java:9: error: cannot find symbol
//         XX x;//compilation fail
//         ^
//   symbol:   class XX
//   location: class Y
// Y.java:13: error: cannot find symbol
//         XX x;
//         ^
//   symbol:   class XX
//   location: class Y
// 2 errors
// error: compilation failed
