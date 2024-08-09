class Car {

}

class SportsCar extends Car {
    
}

public class C {
    public static void main(String[] args){
        Car c = new SportsCar();
        C x = new C();

        x.pro(c);//this will print Car because method overloading is done at the time of compilation
    }
    void pro(Car c){
        System.out.println("Car");
    }
    void pro(SportsCar c){
        System.out.println("SportsCar");
    }
}
