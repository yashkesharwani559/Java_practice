public class H2 extends A {
    X pro() {
        return null;
    }

}

class X{

}

class Y extends X{

}

class Z extends Y{}


class A{
    X pro() {
        return null;
    }
}

//no compilation error 