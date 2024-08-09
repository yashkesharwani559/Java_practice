
interface A{}

class B implements A{}

class C implements A{}

class D implements A{}
class N1{
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