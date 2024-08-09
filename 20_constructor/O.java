class Animal {
    Animal() {
        super();
        System.out.println("Animal" + this);
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog" + this);
    }
}

class BDog extends Dog{
    BDog(){
        super();
        System.out.println("BDog" + this);
    }
}

public class O {
    public static void main(String[] args) {
        BDog d = new BDog();
        System.out.println(d);

    } 
}
