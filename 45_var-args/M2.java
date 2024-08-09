public class M2 {
    static void info(float x, String... w) {
        System.out.println(x);

        for(String next : w) {
            System.out.println(next);
        }
    }
    public static void main(String[] args){
    
        info(3.56f);//correct

    }
}