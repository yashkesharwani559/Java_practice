//Task 2: to create a 2D array and store the same values to the another 2D array but directly in the second 2D array store it in the reverse order

public class E1 {
    public static void main(String[] args) {
        
        int[][] x = { { 2, 3, 5 }, { 56, 78, 90, 123, 567 }, { 1, 5 } };

        int[][] y = new int[x.length][];

        for(int i = x.length - 1; i >= 0; i--){
            y[x.length - i -1] = new int[x[i].length];
        }
        
        System.out.println("array x :");
        for (int[] next : x) {
            for (int num : next) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
        
         
        for (int i = x.length - 1; i >= 0; i--) {
            for (int j = 0; j < x[i].length; j++) {
                y[x.length - i - 1][j] = x[i][j];
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
// 1, 5,
// 56, 78, 90, 123, 567,
// 2, 3, 5,