import java.util.ArrayList;

public class N1 {
    public static void main(String[] args){
        
        ArrayList<? extends Number> list = new ArrayList();//correct and here the list is an ArrayList of type Number
        
        // ArrayList<? extends Number> list = new ArrayList<>();//correct and here the list is an ArrayList of type Number
        //and due to use of the shortcut method we cannot add any element in the ArrayList.

    }
}
