class D {
    // to access the instance memebers of one class from another class we have two
    // ways
    // 1. Accesss using Instantiation
    // 2. Access using Inheritance
    // here we see example of access using instantiation

    public static void main(String[] args) {
        F x = new F();// here in instantiation, we have to create object/instance of that class only
                      // for which we want to access the methods

        System.out.println(x.y);
    }
}

class F {
    int y = 45;

}
