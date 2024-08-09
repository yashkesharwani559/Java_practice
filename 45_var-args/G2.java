public class G2 {
    public static void main(String[] args){
        
        byte b = 45;
        short s = 23;
        char c = 'A';
        int i = 67;
        long l = 678l;

        pro(b, s, c, i, (int)l);//allowed because we have explicitly typecast from long to int
    }
    static void pro(int... a){
        for(int x : a){
            System.out.println(x);
        }
    }
}