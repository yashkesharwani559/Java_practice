class A {
    int x = 34;
    static int y = 45;
    void pro() {
        System.out.println("pro");
    }    
    static void pro2() {
        System.out.println("pro2");
    }    
}


public class J{
    static {

        System.out.println("static");
        A x = new A();
        x.pro();
        A.pro2();
        System.out.println(x.x);
        System.out.println(A.y);
    }
    
    {

        System.out.println("instance");
        A x = new A();
        x.pro();
        System.out.println(x.x);
        System.out.println(A.y);
        A.pro2();
    }

    public static void main(String[] args) {
        J x = new J();        
    }
}

// static
// pro
// pro2
// 34
// 45
// instance
// pro
// 34
// 45
// pro2

//this above output shows that we can call anything from another class in the instance and static initialization block