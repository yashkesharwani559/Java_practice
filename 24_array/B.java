public class B {
    public static void main(String[] args) {
        Animal a = new BDog();
        Animal[] ab = { a };
        //this is a valid legal code

        System.out.println(ab);
        System.out.println(ab[0]);
    }
}

//this will give output as
// [LAnimal;@3b22cdd0
// BDog@1e81f4dc
