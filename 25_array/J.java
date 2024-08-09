public class J {
    public static void main(String[] args){
        int[][] x = new int[3][];

        System.out.println(x[0].length);
    }
}
//this will give exception as
// Exception in thread "main" java.lang.NullPointerException
//         at J.main(J.java:5)