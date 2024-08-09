class G{
    int a = 45;

}

class A extends G{
    public static void main(String[] args){
        // A x = new A();
        G x = new G();

        System.out.println(x.a);
    }
}