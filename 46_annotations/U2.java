public class U2 {
    public static void main(String[] args) {
        System.out.println(U22.name);//this is how we can use the constant fields of the annotations
        // here the annotation is treated as an interface
    }
}

@interface U22 {
    String name = "hello";

    String hello();
}
// here name is a constant that is implicitly public static final