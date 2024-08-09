public class S<A, B, C> {
    //correct with no error
    public static void main(String[] args){
        S<String, Integer, String> s = new S<>();
        System.out.println(s);
    }
}
