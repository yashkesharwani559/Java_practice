public class A1 {
    public static void main(String[] args) {
        System.out.println(1);

        int[] x = { 1, 2, 3 };

        System.out.println(x[3]);

        System.out.println(2);

    }
}

//output
// 1
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//         at A1.main(A1.java:7)