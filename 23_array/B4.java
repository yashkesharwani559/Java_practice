public class B4 {
    String[] a = new String[2];
    // [Ljava.lang.String;@63355449
    public static void main(String[] args){
        B4 x =new B4();

        System.out.println(x.a);
        System.out.println(x.a[0]);
        System.out.println(x.a[1]);
    }
}

//this will print output as
// [Ljava.lang.String;@63355449
// null
// null

// so this means that we can create array of the objects of a class also