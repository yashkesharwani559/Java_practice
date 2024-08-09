public class A1 {
    public static void main(String[] args){
        int[][] x = new int[2][3];

        System.out.println(x[0][0].length);
    }
}
//this will compilation error as
// A1.java:5: error: int cannot be dereferenced
//         System.out.println(x[0][0].length);
//                                   ^
// 1 error
