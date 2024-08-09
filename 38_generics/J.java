import java.util.ArrayList;

public class J {
    public static void main(String[] args) {

        ArrayList<? extends Number> l1 = new ArrayList<>();// this is correct but here we cannot perform operations like
                                                           // add() & set() method on these records.
        // And if we try to do so, it will give compilation error

        //but using isEmpty(), size(), remove() ,get() will give no compilation error

        l1.add(12);// compilation fail

        // l1.add("mohan");//compilation fail

    }
}
// J.java:12: error: incompatible types: int cannot be converted to CAP#1
//         l1.add(12);// compilation fail
//                ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Number from capture of ? extends Number
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error
// error: compilation failed