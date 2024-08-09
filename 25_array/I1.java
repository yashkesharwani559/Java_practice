public class I1 {
    public static void main(String[] args) {
        int[][] x = { { 2, 3, 4 }, { 5, 67, 78 }, { 12, 45, 78 } };

        //traversing of a 2D array using classical for loop
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; i < x[i].length; j++) {
                System.out.print(x[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
