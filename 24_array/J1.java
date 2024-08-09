public class J1 {
    public static void main(String[] args) {
        long a = 435l;
        float c = 234.567f;
        double s = 2323454.34534;
        byte b = 23;

        int[] ar = new int[a];
        System.out.println(ar.length);

        int[] cr = new int[c];
        System.out.println(cr.length);
        int[] sr = new int[s];
        System.out.println(sr.length);
        int[] br = new int[b];
        System.out.println(br.length);

    }
}
//this will compilation error as
// J1.java:8: error: incompatible types: possible lossy conversion from long to int
//         int[] ar = new int[a];
//                            ^
// J1.java:11: error: incompatible types: possible lossy conversion from float to int
//         int[] cr = new int[c];
//                            ^
// J1.java:13: error: incompatible types: possible lossy conversion from double to int
//         int[] sr = new int[s];
//                            ^
// 3 errors

//this is because float, long, double are not implicitly convertible to the int
// float have same size of bytes as of int but using some constants float can store values of very large size and that's why it is giving compilation error
