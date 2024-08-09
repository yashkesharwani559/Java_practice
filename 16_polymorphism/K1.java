class A{
}

class B extends A{}

class C extends A{}

class D extends C{}

class K1{
    public static void main(String[] args){
        A x = new D();
        C a = (C) x;
        C b = (D) x;
    }
}
//this will give no error and run without any trouble