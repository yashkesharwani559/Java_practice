public class E {
    static void pro2() {
        System.out.println("pro2");
    }

    static int y;

    static {
        System.out.println(x);
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

//this will give error at line 9 because static block can access only those static variables of class that are decalred above it and that's why it is giving error at accessing of x but the static{} block can access any method from anywhere this means that static methods are loaded before the static{}

// this will give error as 
// E.java:9: error: illegal forward reference
//         System.out.println(x);
//                            ^
// 1 error
// error: compilation failed