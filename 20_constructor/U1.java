public class U1 {
    public static void main(String[] args) {
        B x = new B();

        System.out.println(x.name);//yash

        A y = x;
        System.out.println(y.name);//ram
    }
}

class A{
    String name;

    A() {
    
        name = "ram";
    }
}

class B extends A{
    String name;

    B(){
        this.name = "yash";
    }
}
