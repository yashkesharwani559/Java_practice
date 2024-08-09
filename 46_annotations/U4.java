public class U4 {

}

@interface UU4 {
    String name();
}

// This above is how we declare attributes inside the custom annotations.
// But we should know that the attributes inside the custom annotations are
// impilcitly methods that don't have method body.
// This is basically the syntax to declare attributes inside an annotation and
// the return type defines the type of the attributes