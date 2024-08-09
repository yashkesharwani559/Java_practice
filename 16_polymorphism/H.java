class Vehicle{}

class Car extends Vehicle{}

class SportsCar extends Car{}

class H{
    public static void main(String[] args){
        Object x = new SportsCar();

        if(x instanceof SportsCar)
            System.out.println("SportsCar is a SportsCar");//this will be print
        else
            System.out.println("SportsCar is not a SportsCar");

    }
}