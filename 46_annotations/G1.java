import java.util.ArrayList;

public class G1 {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();

        @SuppressWarnings("unchecked")
        arr.add(23);//compilation error
        arr.add(45);
        arr.add(67);
        arr.add(92);

        System.out.println(arr);

    }
}

// This will give compilation error because @SuppressWarnings annotation is not applicable to the method calling.

// G1.java:9: error: <identifier> expected
//         arr.add(23);
//                ^
// 1 error
// error: compilation failed