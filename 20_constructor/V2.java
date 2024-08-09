class A {
    A(int x) {
        System.out.println(x);
    }
}

class B extends A {
    static int m = 15;
    B(){
        super(m);
    }
}

//this will no compilation error because the variable is static and the static variable are created and initialized at the time of class loading when the class Class object is created