public class T {

    void pro(Animal x) {
        x.ms();
    }

    public static void main(String[] args) {
        T x = new T();

        Animal x1 = new Animal();
        Animal y = new Cat();
        Cat c = new Cat();
        Dog d = new Dog();
        Cow z = new Cow();

        x.pro(x1);//animal

        x.pro(y);//Cat

        x.pro(c);//Cat

        x.pro(d);//Dog

        x.pro(z);//Cow
    }
}

class Animal{
    void ms(){
        System.out.println("animal");
    }
}

class Cow extends Animal{
    void ms(){
        System.out.println("Cow");
    }
}

class Cat extends Animal{
    void ms(){
        System.out.println("Cat");
    }
}

class Dog extends Animal{
    
    void ms(){
        System.out.println("Dog");
    }
}
