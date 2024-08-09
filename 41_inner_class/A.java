class A {
    private int e = 45;

    void pro() {
        class X {//instance method local inner class   //A$1X.class
            void pro() {
                System.out.println(e);
            }
        }
        new X().pro();
    }

    public static void main(String[] args) {
        new A().pro();
    }
}

//means instance method local inner class can directly access all the members of the outer class.

//output
// 45