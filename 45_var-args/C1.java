public class C1 {
    static void pro(int... a) {
        System.out.println(a.length);
        for(int next : a){
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        pro(12, 45, 67);//allowed
    }
}
//output
// 3
// 12
// 45
// 67