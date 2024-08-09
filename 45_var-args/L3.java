public class L3 {
    static void pro(float f, int... x) {
        System.out.println(f);
        for (int a : x) {
            System.out.println(a);
        }
    }
    public static void main(String[] args){
        pro(5.6f, 34, 546, 67);
    }
}

// 5.6
// 34
// 546
// 67