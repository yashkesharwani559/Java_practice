class A {
    static {
        System.out.println("static A");
    }
    
    A() {
        
        System.out.println("constructor A");
    }
}

class G1 {
    static {
        System.out.println("static G1");
    }
    public static void main(String[] args) {
        
    }
}

//this will give output as
// static G1