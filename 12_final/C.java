final class A{
    int j = 34;

    void pro(){
        System.out.println("Hello");
    }
}

class B extends A{
    public static void main(String[] args){
        A x = new A();

        System.out.println("Hello");

        x.pro();
    }
}

// C.java:9: error: cannot inherit from final A
// class B extends A{
//                 ^
// 1 error