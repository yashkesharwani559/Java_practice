public class E {
    static int[] a;
    public static void main(String[] args){
        System.out.println(a);
        System.out.println(a.length);
    }
}
//this will print as
// null
// Exception in thread "main" java.lang.NullPointerException
//         at E.main(E.java:5)

//here it is giving nullPointerException because the array object is not assigned to the variable 'a' so it contains null and we cannot use null for any reference