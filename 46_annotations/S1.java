
public class S1<@Gablu G> {//compilation fail
    public static void main(String[] args) {

    }
}
//because when we directly create a custom annotation, then it is applicable on class, constructor, method and variables but it is not applicable in the typesafety.

@interface Gablu {

}

// S1.java:2: error: annotation @Gablu not applicable in this type context
// public class S1<@Gablu G> {
//                 ^
// 1 error
// error: compilation failed