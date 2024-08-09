class J3 {
    J3(Integer... x){
        System.out.println("hello");
    }
    public static void main(String[] args){
        int i1 = 34;
        int i2 = 64;
        int i3 = 84;
        int i4 = 94;

        int[] arr = {i1, i2, i3, i4};

        new J3(arr);//ompilation error
        // because the primitive int array object can't be stored in a Integer array variable
        
    }
}
// we can call the garbage collector by using System.gc() (static) method in the code but it is not recommended


// J3.java:13: error: constructor J3 in class J3 cannot be applied to given types;
//         new J3(arr);//ompilation error
//         ^
//   required: Integer[]
//   found: int[]
//   reason: varargs mismatch; int[] cannot be converted to Integer
// 1 error
// error: compilation failed