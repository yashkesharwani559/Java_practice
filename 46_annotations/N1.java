import java.util.ArrayList;

public class N1 {

    @SuppressWarnings({ "unchecked", "deprecation" })
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();

        arr.add(56);

        Integer i = new Integer(45);

        System.out.println(i);

    }
}
//if we want to write more than one warnings to suppress then we have to follow this syntax :- 
// @Suppresswarnings({"warning1", "warning2"})

//now this will give no warnings
//output
// 45