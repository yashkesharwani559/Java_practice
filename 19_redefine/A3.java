class A3 extends B1 {
    static int x = 435;

    public static void main(String[] args) {
        B1 x = new A3();
        System.out.println("x: " + x.x);
    }
}

// this will give no error message
//this will print x: 23

class B1{
    static int x = 34;
}