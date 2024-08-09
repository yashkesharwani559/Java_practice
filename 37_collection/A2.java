import java.util.ArrayList;

class A2 {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();

        arr.add(12);
        arr.add(78);
        arr.add(97);
        arr.add(19);
        arr.add(36);
        arr.add(74);

        System.out.println(arr);

        Integer[] i = arr.toArray(new Integer[0]);//compilation error

        for (Object o : i) {
            System.out.println(o);
            System.out.println(((Integer) o).intValue());//same as above    
        }

    }
}
// A2.java:17: error: incompatible types: Object[] cannot be converted to Integer[]
//         Integer[] i = arr.toArray(new Integer[0]);//compilation error
//                                  ^
 