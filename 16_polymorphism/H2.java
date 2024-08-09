class Vehicle{}

class Car extends Vehicle{}

class SportsCar extends Car{}

class H2{
    public static void main(String[] args){
        Object x = new SportsCar();

        if(x instanceof Car)
            System.out.println("SportsCar is a SportsCar");
        else
            System.out.println("SportsCar is not a SportsCar");

    }
}

// this will give error on line 11 as xz
// H2.java:13: error: cannot find symbol
//         if(Car instanceof x)
//            ^
//   symbol:   variable Car
//   location: class H2
// H2.java:13: error: cannot find symbol
//         if(Car instanceof x)
//                           ^
//   symbol:   class x
//   location: class H2
// 2 errors