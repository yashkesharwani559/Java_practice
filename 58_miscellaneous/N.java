class N {
    public static void main(String[] args){
        A a = new B();

        System.out.println(a.s);

    }
}

class A {
    String s = "Class A";
}

class B extends A {
    String s = "Class B";
}