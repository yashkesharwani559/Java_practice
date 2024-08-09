public class S1 {
    int s = 45;
    class R{
        int s = 23;
        class T{
            int s = 67;

            class U {
                int s = 19;
                class V{
                    int s = 93;
                    class W extends TT{
                        int s = 28;

                        void pro(){
                            int s = 17;
                            System.out.println(s);
                            System.out.println(this.s);
                            System.out.println(V.this.s);
                            System.out.println(U.this.s);
                            System.out.println(T.this.s);
                            System.out.println(R.this.s);
                            System.out.println(S1.this.s);
                            System.out.println(super.s);
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        R.T.U.V.W w = new S1().new R().new T().new U().new V().new W();
        w.pro();
    }
}
class TT{
    int s = 59;
}
//output
// 17
// 28
// 93
// 19
// 67
// 23
// 45
// 59