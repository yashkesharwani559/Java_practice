public class D {
    public static void main(String[] args){
        int[][] x = { { 2, 3, 5 }, { 56, 78, 90, 123, 567 }, { 1, 5 } };
        for (int[] next : x) {
            for (int num : next) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
    }
}


//this will print output as
// 2, 3, 5,
// 56, 78, 90, 123, 567,
// 1, 5,
