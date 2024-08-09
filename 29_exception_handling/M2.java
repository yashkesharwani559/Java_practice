public class M2 {
    public static void main(String[] args){
        System.out.println(1); 
        try{
            System.out.println(2); 
            int[] x = { 1, 2, 3 };
            System.out.println(x[3]);
            System.out.println(3); 
        }
        finally {
            System.out.println("finally runs");
        }
        System.out.println(4); 
    }
}

//output
// 1
// 2
// finally runs
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        // at M1.main(M1.java:7)