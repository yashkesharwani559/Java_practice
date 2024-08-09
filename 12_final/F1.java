class F{
    void aa(){
        System.out.println("Hello in aa F");
    }
    final void bb(){
        System.out.println("Hello in bb F");
    }
}

class A{
    public static void main(String[] args){
        F x = new F();

        x.aa();
        x.bb();
        // so a final method can be accessible using instantiation
    }
}