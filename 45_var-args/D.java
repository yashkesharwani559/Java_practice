public class D {
    public static void main(String[] args){
        pro("mohan");
    }
    static void pro(String... x){
        System.out.println(x);
        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[0].length());
    }
}
//output
// [Ljava.lang.String;@7d4793a8
// 1
// mohan
// 5