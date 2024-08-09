public class B2 {
    int x = 34;

    static int a = 35;

    void pro() {
        System.out.println("pro");
    }

    static void pro1() {
        System.out.println("pro1");
    }

    {
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        pro();
        pro1();
        pro2();
        pro3();
    }
    
    B2(){
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(y);
        pro();
        pro1();
        pro2();
        pro3();
    }
    static int b = 25;
    int y = 20;

    void pro2() {
        System.out.println("pro2");
    }

    static void pro3() {
        System.out.println("pro3");
    }

    public static void main(String[] args) {
        B2 x = new B2();
    }
}

//this will give no compilation error which means that the instance block runs with the declaration and initialization of the variables but the top down declaration of them matters that which is accessible to the instance block or not

//this will give output as
// 34
// 35
// 25
// pro
// pro1
// pro2
// pro3
// 34
// 35
// 25
// 20
// pro
// pro1
// pro2
// pro3