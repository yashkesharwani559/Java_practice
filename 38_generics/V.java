import java.util.ArrayList;
 
public class V<T> {
    public static void main(String[] args) {
        
        V<ArrayList> v = new V<>();
        V<ArrayList<Integer>> v1 = new V<>();
        V<ArrayList<ArrayList<Integer>>> v2 = new V<>();

        System.out.println(v);
        System.out.println(v1);
        System.out.println(v2);
        
    }
}
