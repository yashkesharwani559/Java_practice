class A{

}
interface B{

}

interface C extends B{

}

class E extends A {

}

class F extends E{

}
class D extends F implements C {
    public static void main(String[] args){
        D x = new D();

        System.out.println(x instanceof D);
        System.out.println(x instanceof A);
        System.out.println(x instanceof B);
        System.out.println(x instanceof C);
        System.out.println(x instanceof E);
        System.out.println(x instanceof F);
        System.out.println(x instanceof Object);
    }
}
//all will print true