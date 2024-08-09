class A {
    static {
        System.out.println("static A");
    }
    
    A() {
        
        System.out.println("constructor A");
    }
}

class G3 extends A {
    static {
        System.out.println("static G1");
    }
    
    G3(){
        System.out.println("constructor G1");

    }
    public static void main(String[] args) {
        G3 c = new G3();
    }
}

//this will give output as
// static A
// static G1
// constructor A
// constructor G1