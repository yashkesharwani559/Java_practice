import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class T1 {
    public static void main(String[] args) {

        Class klass = TT1.class;

        Object obj = klass.getAnnotation(Mno.class);

        System.out.println(obj);// null

    }
}
// here the obj is null because by default the annotation is only till the
// compile time
// and to make it runtime we use @Retention annotation

@Retention(RetentionPolicy.RUNTIME)
@interface Mno1 {

}

@Mno
class TT1 {

}

// @Retention -> is a meta annotation in java, that is applied to a custom
// annotation to make it that it has made to be accessible at which stage :-
// till compilation, till runtime etc
// but at a time, we can apply any one only
// Here @Retention annotation wants some value as argument, and this value we
// give using the RetentionPolicy

// RetentionPolicy is an enum in the java.lang.annotation package that has three
// public static final predefined values.
// it has three variables
// 1. SOURCE -> this variable if applied then it means it is valid till the
// compiler, but after compilation it is removed. Here it means object of that
// annotation class.
// 2. CLASS -> this variable if applied then it means this object is written in
// the .class only, but before the execution JIT (JustInTime compiler) removes
// this object.
// 3. RUNTIME -> this variable if applied then this object of the annotation
// will be there till the runtime.

// What is JIT?
// JIT full form is JustInTime compiler. So JIT is basically a compiler that is
// present in the JRE(Java Runtime Environment). JIT has basically two uses:
// to optimise the code according to the environment
// to improve the performance of code on various Operating Systems.
// Some predefined annotations having the Retention policy as:
// @Deprecated -> RUNTIME
// @FunctionalInterface -> RUNTIME
// @SuppressWarnings -> SOURCE
// @Override -> SOURCE
// @Documented -> RUNTIME
// @Target -> RUNTIME
// @Retention -> RUNTIME

