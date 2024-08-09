public class P {
    Circle p = new Circle()

    public static void main(String[] args) {

    }
}

class Circle {
    private int radius;
    
}

class Consumer extends Thread{
    public void run(){
        P.p.readRadius();
    }
}