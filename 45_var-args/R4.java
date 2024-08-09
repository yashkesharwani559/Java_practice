public class R1 {
    static void abc(int[]... a) {//correct
        for (int[] ar : a) {
            for (int next : ar) {
                System.out.println(next);
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 2, 3, 5 }, { 5, 78 }, { 6, 8, 1, 90 } };
        abc(arr);// correct
    }
}

// 2
// 3
// 5
// 5
// 78
// 6
// 8
// 1
// 90