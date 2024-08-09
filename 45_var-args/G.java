public class G {
    public static void main(String[] args){
        
        byte b = 45;
        short s = 23;
        char c = 'A';
        int i = 67;

        pro(b, s, c, i);//allowed because all byte, char and short are implicitly convertible to the int
    }
    static void pro(int... a){
        for(int x : a){
            System.out.println(x);
        }
    }
}
//output
// 45
// 23
// 65
// 67