import java.util.ArrayList;
 
public class R {
    public static void main(String[] args) {

        CarRental cn = new CarRental();
        cn.addCar(new Car());
        Car c = cn.getCar();

        BusRental bus = new BusRental();
        bus.addBus(new Bus());
        Bus c1 = bus.getBus();

    }
}

//here the code redundancy is there
class Car{}
class Bus{}

class CarRental{
    ArrayList<Car> cars = new ArrayList<>();

    void addCar(Car c){
        cars.add(c);
    }

    Car getCar(){
        return cars.remove(0);
    }
}

class BusRental{
    ArrayList<Bus> buses = new ArrayList<>();

    void addBus(Bus c){
        buses.add(c);
    }

    Bus getBus(){
        return buses.remove(0);
    }
}