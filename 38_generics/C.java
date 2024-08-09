import java.util.ArrayList;

public class C {
    public static void main(String[] args){
        ArrayList list = new ArrayList();

        list.add(23);
        list.add(89);
        list.add(56);

        Integer i = list.get(0);//compilation fail
        // because inside the ArrayList, in reality it contains the only the variable of Object class and then these vairable can store the object of any class
        // since ArrayList contains variables of Object class, that's why ArrayList can store objects of any class which makes it typesafe

    }
}
// C.java:11: error: incompatible types: Object cannot be converted to Integer
//         Integer i = list.get(0);//compilation fail
