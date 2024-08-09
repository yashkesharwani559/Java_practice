public class F {
    F() {
        int count = 0;
        count++;
    }

    public static void main(String[] args) {
        F a = new F();
        F b = new F();
        // System.out.println(a.count);// not ok
    }
}
// this will compilation error because count variable is declared inside the
// constructor as local variable and a local variable can be accessed inside its
// scope only

// F.java:10: error: cannot find symbol
// System.out.println(a.count);// not ok
// ^
// symbol: variable count
// location: variable a of type F
// 1 error
// error: compilation failed
