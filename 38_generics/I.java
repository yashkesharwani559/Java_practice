import java.util.ArrayList;

public class I {
    public static void main(String[] args){
        
        // ArrayList<Number> list = new ArrayList<Integer>();//compilation fail because both side must have same typesafety class and no subclass is allowed

        ArrayList<Number> list = new ArrayList<Number>();
        // the ArrayList for Number interface can be used to store the elements/objects of the subclass of the Number interface

        list.add(12);
        list.add(3.45);
        // list.add(true);//compilation fail

    }
}
