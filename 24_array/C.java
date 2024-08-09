public class C {
    public static void main(String[] args) {
        Animal x = new BDog();//valid legal code

        Animal[] y = new BDog[3];//valid legal code
        //this will create an array object of BDog class

        System.out.println(x);// BDog@3b22cdd0
        System.out.println(y);// [LBDog;@1e81f4dc
    }
}
//this will give output as
// BDog@3b22cdd0
// [LBDog;@1e81f4dc