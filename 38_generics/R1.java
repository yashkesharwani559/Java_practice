import java.util.ArrayList;
 
public class R1 {
    public static void main(String[] args) {
        
        Rental<Car> cn = new Rental<>();
        cn.add(new Car());
        Car c = cn.get();
        
        Rental<Bus> bus = new Rental<>();
        bus.add(new Bus());
        Bus c1 = bus.get();
        
    }
}
class Car{}
class Bus{}
//here using generics to reduce code redundancy
class Rental<Z>{
    ArrayList<Z> buses = new ArrayList<>();

    void add(Z c){
        buses.add(c);
    }

    Z get(){
        return buses.remove(0);
    }
}