public class A1 {
  
    public static void main(String[] args){
        Animal a = new Animal();
        Cat c = new Cat();
        Cow o = new Cow();
        Dog d = new Dog();
        BDog dd = new BDog();

        Animal[] ab = { a, c, o, d, dd, new Cat(), new Cow(), new Animal() };
        
        for(Animal anm : ab)
        System.out.println(anm);
    }
}

//this will give output as
// Animal@4d591d15
// Cat@65ae6ba4
// Cow@48cf768c
// Dog@59f95c5d
// BDog@5ccd43c2
// Cat@4aa8f0b4
// Cow@7960847b
// Animal@6a6824be