
public class J1 {
    int x = 67;
     
    void pro() {
        class X implements AAX9 {

            void pro() {
                System.out.println(x);//56
            }
        }
        new X().pro();
    }
    public static void main(String[] args){
        new J1().pro();
    }
}

interface AAX9{
    int x = 56;
}