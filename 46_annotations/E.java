public class E extends EE{
    void pro(int x){
        System.out.println("hello");
    } 
    public static void main(String[] args){
        EE e = new E();
        e.pro(12);//hello
    }
}
class EE{
    void pro(float x){
        System.out.println("hii");
    }
}