public class H {
    public static void main(String[] args) {
        
        int n = 4;

        for(int i = 0; i<2*n; i++){

            for (int j = 0; j < 2 * n; j++) {

                if (i <= 4) {
                    if (i + j >= 7 || j <= i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (i + j <= 7 || (i + j >= 10 && j >= i)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }
}

/*
*             * 
* *         * * 
* * *     * * * 
* * * * * * * * 
* * * * * * * * 
* * *     * * * 
* *         * * 
*             * 
 */