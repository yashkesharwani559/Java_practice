class T1{
    void pro(){
        class T2 {
            void pro() {
                System.out.println("T1$1T2.class");
                System.out.println(this);
            }
        }
        new T2().pro();
    }
}

public class Z {
    public static void main(String[] args){
        T1 t = new T1();
        t.pro();

    }
}
