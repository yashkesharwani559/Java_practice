public class K {
    public static void main(String[] args) {

        C x = new C();

        System.out.println(x);

    }
}

class A {
    A(){
        System.out.println(this);
    }
}

class B extends A{
    B(){
        System.out.println(this);
    }
}

class C extends B{
    C(){
        System.out.println(this);
    }
}

// run and then output will be

// C@5fdef03a
// C@5fdef03a
// C@5fdef03a
// C@5fdef03a