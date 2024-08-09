public class E1 {
    static void pro2() {
        System.out.println("pro2");
    }

    static int y;

    static {
        
        System.out.println(y);
        pro();
        pro2();

    }

    static void pro() {
        System.out.println("pro");
    }

    static int x;
    public static void main(String[] args){

    }
}

//this will give output as
// 0
// pro
// pro2
