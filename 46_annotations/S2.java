import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Dablu //allowed
public class S2 {

    @Dablu //not allowed
    int x = 45;

    @Dablu //not allowed
    void pro() {

    }

    @Dablu //not allowed
    S2() {
    }

}
  
//here only one is allowed that we put in the class but others are not allowed because for Dablu annotation the target is TYPE and TYPE means only applicable on the classes and its siblings

@Target({ElementType.TYPE})
@interface Dablu{

}

// @Target -> is a meta annotation that is used in the creation of a custom annotation and is basically used to tell the compiler that this annotation is applicable for what and for what it is not applicable.
// @Target takes parameter or a group of parameters in the curly brackets as argument to define the applicability of the custom annotation.

// for the values in the @Target annotation we have an enum named ElementType

// ElementType is an enum present in java.lang.annotation package. It has public static final fields or variables that have predefined values. And these variables are passsed as argument in the @Target annotation.


// S2.java:7: error: annotation type not applicable to this kind of declaration
//     @Dablu //not allowed
//     ^
// S2.java:10: error: annotation type not applicable to this kind of declaration
//     @Dablu //not allowed
//     ^
// S2.java:15: error: annotation type not applicable to this kind of declaration
//     @Dablu //not allowed
//     ^
// 3 errors
// error: compilation failed
