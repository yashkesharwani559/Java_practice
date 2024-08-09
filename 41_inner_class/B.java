class B {
    int e = 45;
    void pro(){
        class X {//instance method local inner class
            void pro() {
                System.out.println(e);
            }
        }
        new X().pro();
    }

    public static void main(String[] args){
        new B().pro();
    }
}
//output
// 45