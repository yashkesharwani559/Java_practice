public class P1 {
    class Q {
        class R {
            class S {
                class T {
                    int x = 45;
                }
            }
        }
    }
    public static void main(String[] args){
        Q.R.S.T t = new P1().new Q().new R().new S().new T();
        
        System.out.println(t.x);

    }
}
//output
// 45
    

