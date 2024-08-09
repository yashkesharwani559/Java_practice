public class J2 {
    public static void main(String[] args) {
        long a = 435l;
        float c = 234.567f;
        double s = 2323454.34534;
        byte b = 23;

        int[] ar = new int[(int) a];
        System.out.println(ar.length);

        int[] cr = new int[(int) c];
        System.out.println(cr.length);

        int[] sr = new int[(int) s];
        System.out.println(sr.length);

        int[] br = new int[b];
        System.out.println(br.length);

    }
}

//this will give output as
// 435
// 234
// 2323454
// 23