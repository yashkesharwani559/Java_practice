import java.util.TreeSet;

public class E {
    public static void main(String[] args) {
        
        TreeSet set = new TreeSet();

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

        Integer i = (Integer) set.ceiling(45);
        System.out.println(i);//74
        // //here we have to explicitly do typecasting because the TreeSet is not used typesafely
        
    }
}
