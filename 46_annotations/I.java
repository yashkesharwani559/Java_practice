public class I {
    public static void main(String[] args) {

        @SuppressWarnings("deprecation")
        Integer i = new Integer(34);

        System.out.println(i);//34

        @SuppressWarnings("deprecation")
        Integer i1 = new Integer(54);

        System.out.println(i1);//54

    }
}
//means we can apply more than one annotations in a file

//output
// 34
// 54