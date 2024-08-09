public class K {
    public static void main(String[] args){
        int[] a = {23, 12,56};
        
        System.out.println(a[3]);
     }
}
// this will give runtime exception as
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//         at K.main(K.java:5)

//this is because we want to access index 3 that is not there in the array object and that's why it is giving ArrayINdexOutOfBoundsException