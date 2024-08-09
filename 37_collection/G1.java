import java.util.TreeMap;

public class G1 {
    public static void main(String[] args) {
        
        TreeMap<String, Integer> set = new TreeMap<>();

        set.put( "mohan", 24);        
        set.put("sohan",4);
        set.put("tohan",2);
        set.put( "johan",76);
        set.put( "gohan",74);
        set.put( "rohan",87);
        set.put( "wohaan",96);

        System.out.println(set);

        System.out.println(set.firstKey());//gohan
        // firstKey() -> is a method that returns the lowest key among all the keys of all the records of the TreeMap

        System.out.println(set.lastKey());//wohaan
        //lastKey() -> is a method that returns the highest key among all the keys of all the records of the TreeMap

    }
}
