
public class J {
    int x = 67;
     
    void pro() {
        class X implements AAX8 {
            int x = 23;

            void pro() {
                int x = 78;
                System.out.println(x);//78
                System.out.println(this.x);//23
                System.out.println(J.this.x);//67
            }
        }
        new X().pro();
    }
    public static void main(String[] args){
        new J().pro();
    }
}

interface AAX8{
    int x = 56;
}