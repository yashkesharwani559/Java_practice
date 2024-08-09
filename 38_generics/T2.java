public class T2 {
    public static void main(String[] args) {
        Integer a = process();
        System.out.println(a);
    }

    static <N> N process(){
        N n = null;//correct
        return n;
    }
}
//typesafety can also be used as a return type