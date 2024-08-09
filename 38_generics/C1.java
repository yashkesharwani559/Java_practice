import java.util.ArrayList;

public class C1 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();

        list.add(23);
        list.add(89);
        list.add(56);

        Integer i = (Integer) list.get(0);//correct
        // but generates warning
        // warning is not a error and warning comes at compile time
        System.out.println(i);//23
    }
}