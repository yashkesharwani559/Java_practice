public class J1 {
    int x = 78;
    void pro(){
        int x = 23;
        System.out.println(x);//23
        System.out.println(this.x);//78
        // here we can call the variable of inner class X by creating its object
        System.out.println(new X().x);//45
    }
    class X {
        int x = 45;
    }
    public static void main(String[] args){
        new J().new X().pro();
    }
}
