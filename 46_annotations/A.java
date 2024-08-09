// Here we will see about Annotations in java.
// In java, annotations are special labels that can be applicable on classes,
// methods, fields, packages, records, sealed classes, interface, abstract
// class, enum and modules to give addtional information about them.
// annotations are not applicable on the initialization blocks in any condition.

// There are two types of annotations in java:-

// 1. Standard Annotations:- These annotations are predefined and are present in
// java.lang package mainly. Two types of the Standard annotaions are:-

// a. General Purpose Annotations:- all general purpose annotations are in
// java.lang package and that's why no need to use it. These are the annotations
// that are used generally and these are not used to create custom annotaions.
// 1.@Override , 2.@Deprecated , 3.@SuppressWarnings, 4.@FunctionalInterface

// b. Meta Annotations:- These annotations are present in java.lang.annotation
// package and that means we have to import before use. These annotations are
// basically used to create custom annotations.
// 1.@Documented, 2.@Inherited, 3.@Retention, 4.@Target

// 2. Custom Annotations:- The annotations that we create are called as custom
// annotations.
// @interface -> is used to create custom annotations.

// @Override -> is a general purpose annotation that is written on the top of
// the overridden method. This annotation is used that helps to check in the
// compilation that the method is successfully overridden or not. @Override is
// applicable only on the overridden method in the child class.

// @SuppressWarnings() -> it is a general purpose annotation that is in
// java.lang package, that's why no need to import it. This annotation takes
// name of warning in the form of String which is to be suppressed.
// @SuppressWarnings is applicable on the local variables, methods and classes.

// Means when we write the unused general purpose annotations then there is no
// problem with that.

// Here this will give no error means we can pass anything as argument in the
// SuppressWarnings() annotation but it will work only when you have given the
// correct name only

// means we can apply more than one annotations in a file

// if we want to write more than one warnings to suppress then we have to follow
// this syntax :-
// @Suppresswarnings({"warning1", "warning2"})

// which means that annotations doesnot follow inheritance, means parent class
// annotation has no relation with the child class.

// @Deprecated is a general purpose annotations in java, that is in java.lang
// package that's why no need to import it. This annotation is applicable on
// class, method, constructor and variables(both local and class level) to whow
// that they are deprecated. The main use of this annotation is to mark the user
// defined things as they are deprecated and should not be used now. Means it is
// basically used to create a warning on a class, method, constructor or
// variable.

// @FunctionalInterface -> a general purpose annotation in java.lang package and
// that's why no need to import it. This annotation is only applicable on the
// interfaces that are functional interfaces and otherwise in any condition,
// this will generate a compilation error. And that's why we can say that it
// provides a compile time security.
// A functional interface that has any number of defined methods but it must
// have only one declared methods.
// and we can define methods in the interface using static, private and default
// keyword.

// @interface is a predefined keyword that is used to create custom annotations.
// when we compile the custom annotations, then for the custom annotations also
// the .class file is generated after compilation
// so by default, the custom annotations we create, are applicable everywhere
// (means in class, method, constructor and variables).
// So by default, custom annotations are meta annotations. Means that one custom
// annotation can be applicable onto the other annotations.

// @Target -> is a meta annotation that is used in the creation of a custom
// annotation and is basically used to tell the compiler that this annotation is
// applicable for what and for what it is not applicable.
// @Target takes parameter or a group of parameters in the curly brackets as
// argument to define the applicability of the custom annotation.

// for the values in the @Target annotation we have an enum named ElementType

// ElementType is an enum present in java.lang.annotation package. It has public
// static final fields or variables that have predefined values. And these
// variables are passsed as argument in the @Target annotation.

// some constants names of the ElementType with their use :-
// 1. ElementType.TYPE -> for the class
// 2. ElementType.TYPE_PARAMETER -> for the typesafety use
// 3. ElementType.METHOD -> for the method
// 4. ElementType.CONSTRUCTOR -> for the constructor
// 5. ElementType.FIELD -> for the variables and fields

// by default the annotation is only till the compile time
// // and to make it runtime we use @Retention annotation

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

// This above is how we declare attributes inside the custom annotations.
// But we should know that the attributes inside the custom annotations are
// impilcitly methods that don't have method body.
// This is basically the syntax to declare attributes inside an annotation and
// the return type defines the type of the attributes

// means annotation can't extends another annotation
// means annotation can't inherited class, abstract class, interface, annotation
// and enum
// similarly no one can inherit the annotations

// annotation doesn't follow inheritance means annotation can't extends another
// annotation. But using meta-annotation technique, one annotation can have the
// properties of other annotation.

// means annotations of the parent class are not inherited to the child class


// int sem = 6;//means this property is not included with the annotation object but it can be called separately using <annotation-name>.<member-name> that is defined like this inside in an annotation


// @Inherited -> is a meta annotation in java.lang.annotation package. If it is applied to the parent class, then the annotation applied on the parent class is also applicable on its child class. It is applied on a custom annotation.

// @Documented -> is a meta annotation applicable only on the custom annotation that in present in java.lang.annotation package. When any custom annotation is applied to anything that has @Documented annotation applied and we run the javadoc command then this will create a documentation by itself.
// To make javadoc all classes must be public 

// javadoc -d Doc *.java  -> command that we have used here to create javadocs