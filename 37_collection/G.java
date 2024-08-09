import java.util.TreeMap;

public class G {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> set = new TreeMap<>();

        set.put(24, "mohan");        
        set.put(4, "sohan");
        set.put(2, "tohan");
        set.put(76, "johan");
        set.put(74, "gohan");
        set.put(87, "rohan");
        set.put(96, "wohaan");

        System.out.println(set);

        System.out.println(set.firstKey());//2
        // firstKey() -> is a method that returns the lowest key among all the keys of all the records of the TreeMap

        System.out.println(set.lastKey());//96
        //lastKey() -> is a method that returns the highest key among all the keys of all the records of the TreeMap

    }
}
