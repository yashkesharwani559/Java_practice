public class C {
    public static void main(String[] args) {
        int[][] x = new int[2][];//legal valid code
        //this will create a 2D array that has two 1D array reference variables storing null in them

        System.out.println(x[0]);
        System.out.println(x[1]);
        
        x[0] = new int[3];
        x[1] = new int[5];
        
        System.out.println(x[0]);
        System.out.println(x[1]);

    }
}
//this will print output as
// null 
// null
// [I@1817d444
// [I@6ca8564a