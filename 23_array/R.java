public class R {
    public static void main(String[] args) {
        int[] a = { 34, 213, 121 };

        for (int i = 0; i < 4; i++) {
            System.out.println(a[i]);
        }

    }
}

// here we have tried to use the array index that is out of the size of array
// then no compilation error will occur and the output is as

// 34
// 213
// 121
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3
// out of bounds for length 3
// at R.main(R.java:7)

// but atlast it is generating an exception called
// ArrayIndexOutofBoundsException ---> this is an exception that is generated
// when we use the index that is out of the size of the array