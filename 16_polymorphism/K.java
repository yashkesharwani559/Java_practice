class A{
    void a(){}
}

class B extends A{
    void b(){}
}

class C extends A{
    void c(){}
}

class K{
    public static void main(String[] args){
        A x = new C();
         
        C c = (C) x;
        c.c();
    }
}
//this will run without any error because now c that contains reference code of the C class object will act like C class