import java.util.regex.Pattern;

public class B1 {
    public static void main(String[] args){
        // Pattern p = new Pattern("hello", 2);//compilation fail
        // because Pattern class constructor is private
    }
}

// B1.java:5: error: Pattern(String,int) has private access in Pattern
//         Pattern p = new Pattern("hello", 2);//compilation fail
//                     ^
// 1 error