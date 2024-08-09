class LivingBeing{}

class Animal extends LivingBeing{}

class Dog extends Animal{}

class BDog extends Dog{}

class G1{
    public static void main(String[] args){
        BDog a = new LivingBeing();
        BDog b = new Animal();
        BDog c = new Dog();
        BDog d = new BDog();
    
    }
    //this will give compilation error because child class variable cannot store the object reference code of the parent class
}

// G2.java:11: error: incompatible types: LivingBeing cannot be converted to BDog
//         BDog a = new LivingBeing();
//                  ^
// G2.java:12: error: incompatible types: Animal cannot be converted to BDog
//         BDog b = new Animal();
//                  ^
// G2.java:13: error: incompatible types: Dog cannot be converted to BDog
//         BDog c = new Dog();
//                  ^
// 3 errors

