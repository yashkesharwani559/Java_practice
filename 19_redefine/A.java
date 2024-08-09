class A extends B {
    int x = 23;

    public static void main(String[] args) {
        B x = new A();
        System.out.println("x: " + x.x);
    }
}
//this will print x: 34 because in java there is no concept of variable of overriding and that's why both variable of the parent and child class are treated as different variables
// so here x is a B class type variable and that's why x version of the class B is called

class B {
    int x = 34;
}