import java.util.SortedMap;
import java.util.TreeMap;
 
public class Y {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(12, "how");
        tm.put(82, "ow");
        tm.put(84, "romm");
        tm.put(68, "spw");
        tm.put(37, "show");

        SortedMap<Integer, String> sm = tm.subMap(30, 80);
        // subMap(int startKey, int EndKey) -> it is a method that is declared in the SortedMap that takes two arguments startKey and endKey and this method returns the object of the SortedMap that contains the key-value pairs that have the key value between the startKey and the endKey

        System.out.println(sm);// {37=show, 68=spw}
        
    }
}
