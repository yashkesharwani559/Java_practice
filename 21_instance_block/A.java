class A {
    {
        System.out.println("hii");
    }

    public static void main(String[] args) {
        A x = new A();
        A y = new A();
        A Z = new A();
    }
}

//this will print output as
// hii
// hii
// hii
