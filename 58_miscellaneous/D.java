import java.io.Console;
 
public class D {
    public static void main(String[] arg) {
        Console c1 = new Console();
        //this will give compilation error because there is no public constructor present in the Console class but it contains a private no parameterized constructor but it is used internally and cannot be accessed from outside 
    }
}

//this will give compilation error as
// D.java:5: error: Console() has private access in Console
//         Console c1 = new Console();
//                      ^
// 1 error
// error: compilation failed