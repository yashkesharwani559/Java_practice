import java.util.ArrayList;

//output
// [[[34, 56, 72], [34, 56, 72], [34, 56, 72]], [[34, 56, 72], [34, 56, 72], [34, 56, 72]], [[34, 56, 72], [34, 56, 72], [34, 56, 72]]]

public class W {
    public static void main(String[] args) {
        
        // creating a D ArrayList
        
        ArrayList<ArrayList<ArrayList<Integer>>> arr = new ArrayList<>();

        ArrayList<ArrayList<Integer>> hm = new ArrayList<>();

        ArrayList<Integer> one = new ArrayList<>();
        one.add(34);
        one.add(56);
        one.add(72);

        hm.add(one);
        hm.add(one);
        hm.add(one);

        arr.add(hm);
        arr.add(hm);
        arr.add(hm);

        System.out.println(arr);
        
    }
}
