import java.util.ArrayList;

public class N {
    @SuppressWarnings("unchecked")
    @SuppressWarnings("deprecation") // this will give compilation error because at one place only one annotation of
                                     // same type is allowed and here both are of type SuppressedWarnings which is
                                     // not allowed
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();

        arr.add(56);

        Integer i = new Integer(45);

        System.out.println(i);

    }
}

// N.java:5: error: SuppressWarnings is not a repeatable annotation type
//     @SuppressWarnings("deprecation") // this will give compilation error because at one place only one annotation of
//     ^
// Note: N.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
// Note: N.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
// error: compilation failed