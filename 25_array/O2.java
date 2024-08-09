public class O2 {
    public static void main(String[] args) {
        int[][][] x = new int[2][3][2];


        // System.out.println(x instanceof int[][][]);// ok
        
        // System.out.println(x instanceof int[][]);// not ok compilation error
        // System.out.println(x instanceof int[]);// not ok compilation error
        // System.out.println(x instanceof int);// not ok compilation error


        
        
        // System.out.println(x[0] instanceof int[][]);//ok

        // System.out.println(x[0] instanceof int[][][]);// not ok compilation error
        // System.out.println(x[0] instanceof int[]);// not ok compilation error
        // System.out.println(x[0] instanceof int);// not ok compilation error
    
        
        
        
        // System.out.println(x[0][0] instanceof int[]);//ok
        
        // System.out.println(x[0][0] instanceof int[][][]);// not ok compilation error
        // System.out.println(x[0][0] instanceof int[][]);// not ok compilation error
        // System.out.println(x[0][0] instanceof int);// not ok compilation error

        


        System.out.println(x[0][0][0] instanceof int[]);// not ok compilation error
        System.out.println(x[0][0][0] instanceof int[][][]);// not ok compilation error
        System.out.println(x[0][0][0] instanceof int[][]);// not ok compilation error
        System.out.println(x[0][0][0] instanceof int);// not ok compilation error
    

        
    }
}
