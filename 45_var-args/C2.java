public class C2 {
    static void pro(int... a) {
        System.out.println(a);
        System.out.println(a.length);
    }

    public static void main(String[] args) {
        int[] a = {45, 56, 78, 19};
        pro(a);//allowed
    }
}
//output
// 3
// 45
// 56
// 78
// 19