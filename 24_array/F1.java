public class F1 {
    public static void main(String[] args){
        int[] x = new int[0];
        System.out.println(x[0]);
    }
}

//this will give exception as
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at F1.main(F1.java:4)