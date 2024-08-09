import java.util.TreeSet;

public class F {
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

        Object ts = set.floor(45);
        System.out.println(ts);//24

        Integer i = set.floor(1);
        System.out.println(i);//null
        // //here we have to explicitly do typecasting because the TreeSet is not used typesafely
        
        System.out.println(set.floor(96));//96
        System.out.println(set.floor(97));//96

    }
}
