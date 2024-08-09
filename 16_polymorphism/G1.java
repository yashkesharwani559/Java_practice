class LivingBeing{}

class Animal extends LivingBeing{}

class Dog extends Animal{}

class BDog extends Dog{}

class G1{
    LivingBeing a = new LivingBeing();
    LivingBeing b = new Animal();
    LivingBeing c = new Dog();
    LivingBeing d = new BDog();
    //this will give no compilation error
}
