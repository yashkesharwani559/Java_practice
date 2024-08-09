import java.util.ArrayList;

public class B {
    public static void main(String[] args){
        ArrayList arr = new ArrayList();

        arr.add(12);
        arr.add(12.34);
        arr.add(true);
        arr.add("hello");
        arr.add('c');
        //above is correct because we have not given the typesafety

        System.out.println(arr);
    
    }
}
// [12, 12.34, true, hello, c]