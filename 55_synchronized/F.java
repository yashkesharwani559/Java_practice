public class F {
    public static void main(String[] args) {
        F e = new F();
        System.out.println("done");
    }

    F(){
        
    }
    {
        synchronized(this){
            System.out.println("E running");
        }
    }
}
// we can write synchronized block inside the instance method, static method, constructors and instance initialization block