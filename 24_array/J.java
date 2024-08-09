public class J {
    public static void main(String[] args) {
        int a = 435;
        char c = 'a';
        short s = 23;
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

//this is valid because the length variable of the array object is made by the java as 'public final int'
// and char, short, byte all are implicitly convertible to int

//this will give output as
// 435
// 97
// 23
// 23