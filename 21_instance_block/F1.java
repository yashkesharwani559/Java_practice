public class F1 {
    int x = 34;

    static {
        System.out.println("start");
        F1 x = new F1();
        System.out.println("end");
    }

    F1() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {

    }
}

//this will give output as
// start
// constructor
// end

//this shows that the constructor is loaded before the static{} block so we can create object inside a static{} block
