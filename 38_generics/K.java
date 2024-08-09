import java.util.ArrayList;
 
public class K {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(54);
        l1.add(79);

        ArrayList<Float> l2 = new ArrayList<>();
        l2.add(12.45f);
        l2.add(2.45f);
        l2.add(1.5f);

        process(l1);
        process(l2);

        System.out.println(l1);
        System.out.println(l2);

    }

    static void process(ArrayList x) {
        // here we are using ArrayList without typesafety, but this will generate a problem that anyone can store any object of any class in that ArrayList which is passed as argument

        x.add(3.78);
        x.add(true);
        x.add("mohan");

        System.out.println(x);
    }

}

//output
// [12, 54, 79, 3.78, true, mohan]
// [12.45, 2.45, 1.5, 3.78, true, mohan]
// [12, 54, 79, 3.78, true, mohan]
// [12.45, 2.45, 1.5, 3.78, true, mohan]