public class N1 {
    public static void main(String[] args){
        int[][][] x = {
                            {
                                {5}, 
                                {6, 7, 9}, 
                                {2, 5, 7}
                            }, 
                            {
                                {4, 5, 79, 92, 59},
                                {334, 56},
                                {12, 45},
                                {12, 45, 58}
                            },
                            {
                                {34, 56, 78, 56, 10, 20, 30, 40},
                                {23, 45, 49, 38}
                            }
                        };
        

        //To traverse the 3D array using the for-each (enhanced for) loop
        for(int[][] a : x ){
            for(int[] b : a){
                for(int num : b){
                    System.out.print(num + ", ");
                }
                System.out.println();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
//output

// 5,
// 6, 7, 9,
// 2, 5, 7,
// ~~~~~~~~~~~~~~~~~~~~~~
// 4, 5, 79, 92, 59,
// 334, 56,
// 12, 45,
// 12, 45, 58,
// ~~~~~~~~~~~~~~~~~~~~~~
// 34, 56, 78, 56, 10, 20, 30, 40,
// 23, 45, 49, 38,
// ~~~~~~~~~~~~~~~~~~~~~~