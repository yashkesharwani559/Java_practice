public class W3 {
    public static void main(String[] args){
        long l = 34;
        double d = 34.45;
        float f = 12.44f;

        int[] a = { (int) l, (int) f, (int) d, (int) 23.45, (int) 34.56 };
        
        for(int x : a)
        System.out.println(x);
    }
}
//this will not give any compilation error because we have explicitly typecast the float, long, double to int 
//big to small    ---> narrow casting(explicit)
//small to big    ---> wide casting(implicit)
