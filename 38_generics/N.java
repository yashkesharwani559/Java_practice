import java.util.ArrayList;
 
public class N {
    public static void main(String[] args){
        // ArrayList<? extends Number> list = new ArrayList<Number>();//correct
        
        // ArrayList<? extends Number> list = new ArrayList();//correct and here the list is an ArrayList of type Number
        
        // ArrayList<? extends Number> list = new ArrayList<>();//correct and here the list is an ArrayList of type Number


        // ArrayList<? extends Number> list = new ArrayList<Object>();//compilation fail not allowed

        // ArrayList<? extends Number> list = new ArrayList<? extends Number>();//not correct compilation fail
        // <? extends Number> this syntax must not be used in the instantiation site

        ArrayList<Float> l1 = new ArrayList<>();
        ArrayList<? extends Number> list = l1;//correct


    }
}
