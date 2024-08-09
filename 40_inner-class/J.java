public class J {
    int x = 78;
    class X {
        int x = 45;
        void pro(){
            int x = 23;
            System.out.println(x);//23
            System.out.println(this.x);//45
            System.out.println(J.this.x);//78
        }
    }
    public static void main(String[] args){
        new J().new X().pro();
    }
}
