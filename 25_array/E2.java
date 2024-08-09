//Task 3: to create a 2D array and store the same values to the another 2D array but in its elements, 1D array the values are in the reverse order

public class E2 {
    public static void main(String[] args) {
        
        int[][] x = { { 2, 3, 5 }, { 56, 78, 90, 123, 567 }, { 1, 5 } };

        int[][] y = new int[x.length][];

        for(int i = 0; i < x.length; i++){
            y[i] = new int[x[i].length];
        }
        
        System.out.println("array x :");
        for (int[] next : x) {
            for (int num : next) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++) {
            
                y[i][j] = x[i][x[i].length - j - 1];
            }
        } 

        System.out.println("\n\narray y");
        for (int[] next : y) {
            for (int num : next) {
                System.out.print(num + ", ");
            }
            System.out.println();
        } 

    }
}

//output
// array x :
// 2, 3, 5,
// 56, 78, 90, 123, 567,
// 1, 5,


// array y
// 5, 3, 2,
// 567, 123, 90, 78, 56,
// 5, 1,