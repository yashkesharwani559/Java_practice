public class M {
    static void info(float x, String... w) {
        System.out.println(x);

        for(String next : w) {
            System.out.println(next);
        }
    }
    public static void main(String[] args){
        info('A', "B", "C", "D");//correct
    }
}
// 65.0
// B
// C
// D