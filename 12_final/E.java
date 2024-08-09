final class A{
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

class B{
    void bb(){
        System.out.println("Hello bb B");
    }

    public static void main(String[] args){
        A x = new A();

        x.aa();
        x.bb();
        x.cc();
    }
}