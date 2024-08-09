class A {
    static {
        System.out.println("static A");
    }
    
    A() {
        
        System.out.println("constructor A");
    }
}

class G2 extends A {
    static {
        System.out.println("static G1");
    }
    public static void main(String[] args) {
        
    }
}

//this will give output as
// static A
// static G1

//this is because the parent class loads before the child class