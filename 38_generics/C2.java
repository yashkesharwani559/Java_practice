import java.util.ArrayList;

public class C2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(23);
        list.add(89);
        list.add(56);

        Integer i = list.get(0);//correct
        
        System.out.println(i);//23
        
    }
}