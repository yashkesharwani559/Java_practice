public class F {
    int x = 10;
    static {
        System.out.println(x);
        System.out.println(y);
    }
    int y = 34;
}
//this will give compilation error because static blocks runs far before the constructor

// F.java:4: error: non-static variable x cannot be referenced from a static context
//         System.out.println(x);
//                            ^
// 1 error
// error: compilation failed