public class F1 {
    public static void main(String[] args){
        // int[][] x = new int[0][0];//this will run without any error


        int[][] x = new int[0][5];//this will run without any error

        // int[][] x = new int[0][-1];//this will give runtime exception as
        // Exception in thread "main" java.lang.NegativeArraySizeException: -1
        // at F1.main(F1.java:5)


    }
}
