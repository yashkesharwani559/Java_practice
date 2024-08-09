public class U extends A {

    void pro() {
        System.out.println("U");
    }

    U() {
        pro();
        super.pro();
    }

    public static void main(String[] args){
        U x = new U();
    }
}

class A{
    void pro(){
        System.out.println("A");
    }
}
//this will give no error and print output as
// U
// A
