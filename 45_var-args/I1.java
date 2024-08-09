public class I1 {
    public static void main(String[] args) {

        LivingBeing lb1 = new LivingBeing();
        LivingBeing lb2 = new BDog();

        pro(lb1, lb2);//compilation fail because parent class object can't be implicitly typecast to a child class object

    }

    static void pro(Animal... x){
        System.out.println("hello");
    }
}
class LivingBeing{

}
class Animal extends LivingBeing{}
class Cat extends Animal{}
class Cow extends Animal{}
class Dog extends Animal{}
class BDog extends Dog{}

// I1.java:7: error: method pro in class I cannot be applied to given types;
//         pro(lb1, lb2);//compilation fail because parent class object can't be implicitly typecast to a child class object
//         ^
//   required: Animal[]
//   found: LivingBeing,LivingBeing
//   reason: varargs mismatch; LivingBeing cannot be converted to Animal
// 1 error
// error: compilation failed