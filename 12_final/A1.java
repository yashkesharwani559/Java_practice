class A{
    void aa(){
        System.out.println("Hello aa A");
    }
    void bb(){
        System.out.println("Hello bb A");
    }
    void cc(){
        System.out.println("Hello cc A");
    }
}

class B extends A{
    void bb(){
        System.out.println("Hello bb B");
    }
    public static void main(String[] args){
        B x = new B();

        x.aa();
        x.bb();
        x.cc();
    }
}