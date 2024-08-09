class A {
    void pro(){}
}

class B extends A {
    void pro(int x) {
    }
}

class C {
    public static void main(String[] args) {
        A x = new B();
        // x.pro(23);//compilation error because class A doesnot know about the child method
        B y = (B) x;
        y.pro();
        y.pro(23);
    }
}
//this is not a method overriding because parameter mismatch is there
// that's we call this as method overloading in java and this method overloading is done to use by child class B and his child classes and parent class A not knows about the overloaded method version