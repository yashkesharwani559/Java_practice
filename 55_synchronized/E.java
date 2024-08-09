public class E {
    public static void main(String[] args){
        E e = new E();
        System.out.println("done");
    }
    E(){
        synchronized (this) {
            System.out.println("E running");
        }
    }
}
//we can write synchronized block inside the instance method, static method and constructors