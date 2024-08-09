public class D2 {
    public static void main(String[] args){
        pro("mohan", "sohan", "rohan");
    }
    static void pro(String... x){
        System.out.println(x);
        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[0].length());
        System.out.println(x[1]);
        System.out.println(x[1].length());
        System.out.println(x[2]);
        System.out.println(x[2].length());
    }
}
//output
// [Ljava.lang.String;@7d8995e
// 3
// mohan
// 5
// sohan
// 5
// rohan
// 5