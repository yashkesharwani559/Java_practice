import java.util.ArrayList;

public class H {
    public static void main(String[] args) {
        ArrayList<Integer> list = process();
        // list.add(12.45);//compilation fail
        // means it simply checks the typesafety of the variable and run the code
        // according to it

        System.out.println(list);

    }

    // [12, 67, 98, true, 1.24]
    static ArrayList process() {
        ArrayList a = new ArrayList();
        a.add(true);
        a.add(1.24);
        // this is a problem with mixing old and new code type in generics
        a.add("mohan");

        return a;
    }
}
