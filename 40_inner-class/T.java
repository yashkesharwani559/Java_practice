public class T {
    int h = 23;

    class X extends XX {
        void pro() {
            System.out.println(h);//45
            // because the variables of the parent class are inherited and then the child class can use it as its own variable
        }
    }
    public static void main(String[] args){
        X x = new T().new X();
        x.pro();
    }
}
class XX{
    int h = 45;
}