class F {
    public static void main(String[] args) {
        F x = new F();

        // x.abc();//this will give compilation error
    }
}

class N {
    void abc() {

    }
}
// F.java:5: error: cannot find symbol
// x.abc();
// ^
// symbol: method abc()
// location: variable x of type F
// 1 error