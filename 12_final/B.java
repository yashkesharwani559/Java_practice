final class A{
    int y = 45;
    void pro(){
        System.out.println("Hello");
    }
} 

class B extends A{
    public static void main(String[] args){
        B x = new B();
        System.out.println("Hello");

        x.pro();
    }
}

// A1.java:8: error: cannot inherit from final A
// class B extends A{
//                 ^
// 1 error

// this error occurs because we cannot inherit a final class 