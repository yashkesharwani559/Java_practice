public class L4 {
    static void pro(float f, int... x){
        System.out.println(f);
        for(int a : x){
            System.out.println(a);
        }
    }
    public static void main(String[] args){
        pro(23, 56, 67);
    }
}
// 23.0
// 56
// 67