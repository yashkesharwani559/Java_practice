public class B1 {
    public static void main(String[] args){
        LivingBeing l = new BDog();

        Animal[] a = {l};
    }
}
//this will give compilation error because we cannot assign parent class variable to the child class variable

//this will give compilation error as
// B1.java:5: error: incompatible types: LivingBeing cannot be converted to Animal
//         Animal[] a = {l};
//                       ^
// 1 error

