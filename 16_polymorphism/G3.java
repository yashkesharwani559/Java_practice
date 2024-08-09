class Vehicle {}

class Fourwheeler extends Vehicle{}

class Car extends Fourwheeler{}

class G3 {
    public static void main(String[] args){
        Car a = new Car();
        Fourwheeler b = new Car();
        Vehicle c = new Car();
        // java.lang.Object d = new Car();//this will give no error
        Object e = new Car();//this will give compilation error because java compiler checks for the Object.class file in same folder (because we have created Object.class in same folder)
    }
}