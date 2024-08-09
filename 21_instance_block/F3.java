public class F3 {
    int x = 34;

    static {

        System.out.println("start");
        System.out.println("static");
        F1 x = new F1();
        System.out.println(x.x);
        System.out.println("end");
    }
    
    F3() {
        System.out.println("constructor");
    }

    int y = 34;

    public static void main(String[] args) {

    }
}

//this will give output as
// start
// static
// start
// constructor
// end
// constructor
// 34
// end