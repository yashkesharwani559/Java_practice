public class J {
    public static void main(String[] args){
        int x = pro();
        System.out.println(x);
    }

    static int pro() {

        try{
            int y = 12/0;

        }catch(ArithmeticException e){
            throw new IllegalArgumentException();
        }finally{
            return 35;
        }
    }
}
//try-catch-finally in the static method body is allowed in java