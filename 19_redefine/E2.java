class A {
    public String toString(){
        System.out.println("A");
        return "A";
    }
}

class B extends A {
    public String toString(){
        System.out.println("B");
        return "B";
    }
    
}

public class E2 extends B {
    void pro() {
        super.toString();//this will give preference to the toString method version of the immediate parent class B that's why B is print on the terminal
    }
    public static void main(String[] args){
        E2 x = new E2();
        x.pro();
    }
}


