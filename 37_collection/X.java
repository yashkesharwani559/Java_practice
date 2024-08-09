import java.util.ArrayList;
 
public class X {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(57);
        arr.add(78);
        arr.add(93);
        arr.add(39);
        arr.add(31);

        Object[] arr1 = arr.toArray();
        Integer[] tmp = new Integer[0];
        Integer[] arr2 = arr.toArray(tmp);//correct because here of the typesafety that is given to the ArrayList arr

        System.out.println(arr1 instanceof Object[]);//true
        System.out.println(arr1 instanceof Integer[]);//false

        System.out.println(arr2 instanceof Object[]);//true
        System.out.println(arr2 instanceof Integer[]);//true

    }
}
