public class F2 {
    int x = 34;

    static {
        System.out.println("start");
        F1 x = new F1();
        System.out.println(x.x);
        System.out.println(x.y);
        System.out.println("end");
    }

    F2() {
        System.out.println("constructor");
    }

    int y = 34;

    public static void main(String[] args) {

    }
}

//this will give compilation error as
// F2.java:8: error: cannot find symbol
//         System.out.println(x.y);
//                             ^
//   symbol:   variable y
//   location: variable x of type F1
// 1 error
// error: compilation failed

// this is becuase the static{} block not knows about the variable declared after it