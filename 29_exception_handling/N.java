public class N {
    public static void main(String[] args){
        System.out.println(1);
        int[] x = {1, 3, 2};
        System.out.println(x[3]);
        System.out.println(2);
        try {
            System.out.println(3);
        }finally{
            System.out.println("finally");
        }
    }
}

//output
// 1
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        // at N.main(N.java:5)

//here the finally doesnot runs because finally runs only when the exception is thrown from the try block 
// and if a method directly throws exception then the finally block doesnot runs