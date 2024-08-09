public class I {
    public static void main(String[] args){
        int[] x = new int[3];

        String[] y = new String[4];

        float[] z = new float[2];

        boolean[] e = new boolean[3];

        System.out.println(x[0]);//0
        System.out.println(x[1]);//0
        System.out.println(x[2]);//0
        
        System.out.println("+++++++++++++++++");
        
        System.out.println(y[0]);//null
        System.out.println(y[1]);//null
        System.out.println(y[2]);//null
        System.out.println(y[3]);//null
        
        System.out.println("+++++++++++++++++");
        
        System.out.println(z[0]);//0.0
        System.out.println(z[1]);//0.0
        
        System.out.println("+++++++++++++++++");
        
        System.out.println(e[0]);//false
        System.out.println(e[1]);//false
        System.out.println(e[2]);//false
    }
}
