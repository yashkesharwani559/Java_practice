import java.util.Arrays;
import java.util.List;


public class W {
    public static void main(String[] args){
        Integer[] x = {34, 57, 89, 98};

        for (int a : x) {
            System.out.print(a+"   ,  ");
        }
        
        List<Integer> list = Arrays.asList(x);
        
        System.out.println("\n" + list);
        
        // list.add(12);//UnsupportedOperationException -> an unchecked exception that comes when we try to add element in the List object that is returned by the asList() method since the returned list is a back list means it cannot grow and shrink but we can perform non-changble operations like get(), size(), isEmpty()
        
        list.remove(1);//UnsupportedOperationException

        System.out.println(list);

        for (int a : x) {
            System.out.print(a+"   ,  ");
        }



    }
}
//asList(array) -> it is a static method in the Arrays class that returns the object of subclass of the List interface. Here it originally returns the object of the ArrayList class that is the private static inner class of the Arrays class. And it is present in java.util.Arrays.ArrayList but since it is private you can't access it privately