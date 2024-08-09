public class G {
    public static void main(String[] args) {
        G e = new G();
        System.out.println("done");
    }

    G() {

    }

    static
    {
        synchronized(G.class){
            System.out.println("G running");
        }
    }
}
// we can write synchronized block inside the instance method, static method, constructors, instance initialization block and static initialization block in java