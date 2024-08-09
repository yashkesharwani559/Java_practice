public class N {
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
        

        // traversing of the 3D array using classical for loop
        for(int i = 0; i < x.length ; i++ ){
            for(int j = 0; j < x[i].length ; j++){
                for(int k = 0; k < x[i][j].length ; k++){
                    System.out.print(x[i][j][k] + ", ");
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