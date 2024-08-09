import java.util.ArrayList;

public class B1 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(12);
        // arr.add(12.34);//compilation fail
        // arr.add(true);
        // arr.add("hello");
        // arr.add('c');
 
        System.out.println(arr);
    
    }
}
//B1.java:8: error: incompatible types: double cannot be converted to Integer
//         arr.add(12.34);//compilation fail
//                 ^
// B1.java:9: error: incompatible types: boolean cannot be converted to Integer
//         arr.add(true);
//                 ^
// B1.java:10: error: incompatible types: String cannot be converted to Integer
//         arr.add("hello");
//                 ^
// B1.java:11: error: incompatible types: char cannot be converted to Integer
//         arr.add('c');
//                 ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 4 errors
// error: compilation failed