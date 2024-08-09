public class F {
    public static void main(String[] args) {
        
        Integer integer = new Integer(34);

        System.out.println(integer);//34

    }
}
//this will give the warning 'deprecation' but run without any error
// Note: F.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.

// to suppress these warnings we use the @SuppressWarnings annotation