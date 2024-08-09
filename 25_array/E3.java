//Task 4: to create a 2D array and store the same values but in the fully reverse order

public class E3 {
    public static void main(String[] args) {
        
        int[][] x = { { 2, 3, 5 }, { 56, 78, 90, 123, 567 }, { 1, 5 } };

        int[][] y = new int[x.length][];

        for(int i = x.length - 1; i > -1; i--){
            y[x.length - i - 1] = new int[x[i].length];
        }
        
        System.out.println("array x :");
        for (int[] next : x) {
            for (int num : next) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
        
        for (int i = x.length - 1; i > -1; i--){
            for (int j = x[i].length - 1; j > -1; j--) {
                y[x.length - 1 -i][x[i].length - 1 - j] = x[i][j];
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
// 5, 1,
// 567, 123, 90, 78, 56,
// 5, 3, 2,