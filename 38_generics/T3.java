import java.util.ArrayList;

public class T3 {
    public static void main(String[] args) {
        System.out.println(process());
    }
// []
    static <N> ArrayList<N> process() {
        ArrayList<N> list = new ArrayList<>();
        return list;
    }
}