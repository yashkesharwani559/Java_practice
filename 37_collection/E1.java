import java.util.TreeSet;

public class E1 {
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();

        set.add(24);        
        set.add(4);
        set.add(2);
        set.add(76);
        set.add(74);
        set.add(87);
        set.add(96);

        System.out.println(set);

        // Object ts = set.ceiling(45);
        // System.out.println(ts);//74

        Integer i = set.ceiling(1);
        System.out.println(i);//2
        // //here we have to explicitly do typecasting because the TreeSet is not used typesafely
        
        System.out.println(set.ceiling(96));//96
        System.out.println(set.ceiling(97));//null

    }
}
