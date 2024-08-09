public class N {
    public static void main(String[] args) {
        int[] x = new int[5];
        
        for(int i=0; i<5; i++) {
            System.out.println(x[i]);
        }

        x[0] = 450;
        x[1] = 210;
        x[2] = 990;
        x[3] = 200;
        x[4] = 120;
    
        for(int i=0; i<5; i++) {
            System.out.println(x[i]);
        }
    }
}
