public class G {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("\d");//compilation fail because single backslash taking the next d as an escape character but there is no character like that
        
    }
}
// g.java:4: error: illegal escape character
//         Pattern p = Pattern.compile("\d");//compilation fail because single backslash taking the next d as an escape character but there is no character like that
//                                       ^
// 1 error
// error: compilation failed
