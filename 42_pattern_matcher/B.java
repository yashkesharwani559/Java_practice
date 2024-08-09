import java.util.regex.Pattern;
 
public class B {
    public static void main(String[] args){
        // Pattern p = new Pattern();//compilation fail
        // because Pattern class constructor takes String, int as argument.
    }
}
// B.java:5: error: constructor Pattern in class Pattern cannot be applied to given types;
//         Pattern p = new Pattern();//compilation fail
//                     ^
//   required: String,int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
// 1 error