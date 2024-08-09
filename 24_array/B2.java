public class B2 {
    public static void main(String[] args) {
        LivingBeing l = new BDog();

        Animal[] a = { (Animal) l };

        System.out.println(a[0]);
        System.out.println(a);
    }
}

//this will not give any compilation error because parent class variable can be explicitly assigned to the child class variable

//this will give output as
// BDog@3b22cdd0
// [LAnimal;@1e81f4dc