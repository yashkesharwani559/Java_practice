public class C2 {
    public static void main(String[] args){
        Animal[] a = { new BDog() };//this will create Animal class array object
        Animal[] b = new BDog[]{ new BDog() };//this will create BDog class array object
        
        System.out.println(a);// [LAnimal;@3b22cdd0
        System.out.println(b);// [LBDog;@1e81f4dc
    }
}

//this will give output as
// [LAnimal;@3b22cdd0
// [LBDog;@1e81f4dc
