public class M {
    public static void main(String[] args) {
        int[] x = new int[5];

        // System.out.println(x[0]);
        // System.out.println(x[1]);
        // System.out.println(x[2]);
        // System.out.println(x[3]);
        // System.out.println(x[4]);

        
        for(int i=0; i<5; i++) {
            System.out.println(x[i]);
        }

        x[0] = 450;
        x[1] = 210;
        x[2] = 990;
        x[3] = 200;
        x[4] = 120;


        // System.out.println(x[0]);
        // System.out.println(x[1]);
        // System.out.println(x[2]);
        // System.out.println(x[3]);
        // System.out.println(x[4]);
    
        for(int i=0; i<5; i++) {
            System.out.println(x[i]);
        }
    }
}

// this will give output as
// 0
// 0
// 0
// 0
// 0
// 450
// 210
// 990
// 200
// 120