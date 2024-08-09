public class B {
    int[] arr = new int[2];
    // [I@635eaaf1  

    public static void main(String[] args) {
        B x = new B();
        System.out.println(x.arr);
        System.out.println(x.arr[0]);
        System.out.println(x.arr[1]);
    }
}

//in java indexing of the elements of the array starts from 0 onwards
// and the elements of the array are initialized with their default value and here its int array and int is initialized by 0 implicitly
// declaration + instantiation --->  this will initialize the value of the array elements with the default value implicitly
//reference code of this array is as
// [I@635eaaf1  
// square bracket open, I for int, @ then the hexadecimal code