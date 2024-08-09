class A {
    A(int x) {
        System.out.println(x);
    }
}

class B extends A {
    int m = 15;
    B(){
        super(10);
    }
}

//this will compile without any error 