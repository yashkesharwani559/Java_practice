class J2 {
    J2(int... x){
        System.out.println("hello");
    }
    public static void main(String[] args){
        Integer i1 = 34;
        Integer i2 = 64;
        Integer i3 = 84;
        Integer i4 = 94;

        Integer[] arr = {i1, i2, i3, i4};

        new J2(arr);//ompilation error
        // because the Integer array object can't be stored in a primitive int  array variable
        
    }
}
// J2.java:13: error: constructor J2 in class J2 cannot be applied to given types;
//         new J2(arr);//ompilation error
//         ^
//   required: int[]
//   found: Integer[]
//   reason: varargs mismatch; Integer[] cannot be converted to int
// 1 error
// error: compilation failed