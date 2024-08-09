public class Q1 {
    public static void main(String[] args){
        String[][][] x = new String[2][3][2];

        System.out.println(x instanceof String[][][]);//true
        System.out.println(x[0] instanceof String[][]);//true
        System.out.println(x[0][0] instanceof String[]);//true
        System.out.println(x[0][0][0] instanceof String);//false

    }
}
