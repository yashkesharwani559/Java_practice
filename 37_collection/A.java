import java.util.ArrayList;

class A{
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(78);
        arr.add(97);
        arr.add(19);
        arr.add(36);
        arr.add(74);

        System.out.println(arr);

        Object[] obj = arr.toArray();
        // Integer[] i = arr.toArray();//compilation error
        // because toArray() returns the array of Object

        // for (Object o : obj) {
        //     System.out.println(o);
        //     System.out.println(((Integer) o).intValue());//same as above    
        // }

    }
}