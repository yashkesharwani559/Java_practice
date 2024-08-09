import java.util.ArrayList;

public class G {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(67);
        list.add(98);

        process(list);
        // list.add(12.45);//compilation fail
        // means it simply checks the typesafety of the variable and run the code according to it

        System.out.println(list);

    }
// [12, 67, 98, true, 1.24]
    static void process(ArrayList a){
        a.add(true);
        a.add(1.24);
        //this is a problem with mixing old and new code type in generics
        System.out.println(a);
    }
}
