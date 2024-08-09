public class S1 {
    public static void main(String[] args){
        // declaration + instantiation + initialization
        int[] a = new int[]{
            23,14,34
        };
        //this is a valid syntax for creating the array in java

        int[] b = {34,56,12};

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
            System.out.println(b[i]);
        }
    }
}
// this will give output as
// 23
// 34
// 14
// 56
// 34
// 12
