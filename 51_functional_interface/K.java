
public class K {
    public static void main(String[] args) {
        // KA a = (x, y) -> {
        //     return x + y;
        // };//correct

        // KA a = (x, y) -> return x + y;//not allowed //not correct  //compilation fail

        KA a = (x, y) -> x + y;//correct //allowed

        System.out.println(a.add(23, 56));

    }
}
//output
// 79

@FunctionalInterface 
interface KA{
    int add(int a, int b);
}