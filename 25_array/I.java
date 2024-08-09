public class I {
    public static void main(String[] args) {
        int[][] x = { { 2, 3, 4 }, { 5, 67, 78 }, { 12, 45, 78 } };

        //traversing of a 2D array using for-each loop
        for (int[] a : x) {
            for (int num : a) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
    }
}
