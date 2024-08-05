class Circle {
    int radius;
    // we will not make it static because every circle has its own radius and it is
    // not common
    static float pi = 3.14f;
    // we had make it static because value of pi is common and shared for all
    // circles
    // static variables are those variables that can be modified so they are not
    // constant
    // static variables cannot be declared inside any method in java
    // so static variables must be declared directly inside the class

    public static void main(String[] args) {
        Circle c1 = new Circle();
        // new --> keyword that creates a blank object
        // Circle() --> here default constructor that is created to intialize the
        // variables and methods for a classtype variable
        // c1 ----> an object of class Circle that is created as reference code variable
        // or classtype variable and is used to store the reference code returned by the
        // object
        // created by new Circle()
        c1.radius = 123;
        c1.pi = 3.15f;
        Circle c2 = new Circle();
        c2.radius = 56;
        c1.pi = 4.15f;// static variables in java can be called like this so this is a legal code in
                      // java
        System.out.println(c1.radius);
        System.out.println(c1.pi);
        System.out.println(c2.pi);
        System.out.println(pi);

        c1.showinfo();
        c2.showinfo();
        getPi1();// this will not give any error
        // so static methods doesnot require to necessary store the returning value of
        // the method
        c1.getPi();// this will also not give any error
        // so here we found that there is no necessity to store or use the returning
        // value of the method in java

    }

    void showinfo() {
        System.out.println(pi);
        System.out.println(radius);
    }// it is recommended to make methods as instance (non-static) only when minimum
     // 1 (0<) instance level variables are accessed or used in that method
     // and make the methods static only when ithe method doesnot uses or access any
     // instance level variable

    static void showinfo2(Circle c1) {// this is not a reccomded practice
        System.out.println(pi);
        System.out.println(c1.radius);
    }

    float getPi() {
        // this is a good approach because the value of the pi returned for every
        // variable is same so this method can be shared and common also
        return pi;
    }

    static float getPi1() {
        // this is a good approach because the value of the pi returned for every
        // variable is same so this method can be shared and common also
        return pi;
    }
}
