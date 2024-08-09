public class Y implements A{
    public static void main(String[] args){
        System.out.println("a");
        A.meth();
    }
}

interface A{
    static void meth() {
        System.out.println("meth");
    }
}