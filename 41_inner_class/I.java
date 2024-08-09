public class I {

    static void pro(AAX5 a) {
        a.pro();
        System.out.println(a);
    }

    public static void main(String[] args) {
        pro(new AAX5() {
            public void pro() {
                System.out.println("toy");
                System.out.println(this);
            }
        });
    }
}

 
//output
// toy
// I$1@37afeb11
// I$1@37afeb11

interface AAX5{
    void pro();
}