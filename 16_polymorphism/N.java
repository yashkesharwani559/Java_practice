abstract class A{}

class B extends A{}

class C extends A{}

class D extends A{}

class N{
    static void invite(A x){
        System.out.println(x);
    }
    public static void main(String[] args){
        B b = new B();
        C c = new C();
        D d = new D();

        invite(b);
        invite(c);
        invite(d);

    }
}
//this will run without any error because parent class parameter variable can have (can be passed) a child class object.