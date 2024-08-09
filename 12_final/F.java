class F{
    void aa(){
        System.out.println("Hello in aa F");
    }

    final void bb(){
        System.out.println("Hello in bb F");
    }

    void cc(){
        System.out.println("Hello in cc F");
    }
}

class A extends F{
    public static void main(String[] args){
        A x = new A();

        x.aa();
        x.bb();
        x.cc();
        // so a final method can be inherited
    }
}