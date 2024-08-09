class A  {
    private A() {

        System.out.println("A");
    }

   static A pro(){
        return new A();
    }
}
 
public class P2 {
    public static void main(String[] args) {
        A x = A.pro();
    }
}
//this will run without any error