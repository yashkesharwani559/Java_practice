import java.util.ArrayList;

public class G2 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();

        arr.add(23);
        arr.add(45);
        arr.add(67);
        arr.add(92);

        System.out.println(arr);
    }
}
// Now it will give no warning and run without any problem

//output
// [23, 45, 67, 92]