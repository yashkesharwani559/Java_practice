import java.util.ArrayList;

public class T {
    public static void main(String[] args) {
        ArrayList<Integer> ol = new ArrayList<>();
        process(ol);

        ArrayList<Float> o2 = new ArrayList<>();
        process(o2);

        ArrayList<Car> o3 = new ArrayList<>();
        process(o3);
    }

    //so here this method can takes any type of ArrayList as argument
    static <M> void process(ArrayList<M> list) {
        // list.add(12);//compilation fail
        System.out.println(list);
    }
}
