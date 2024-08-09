//there can be only one direct/immediate parent of an interface and that parent can only be interface.


// Marker interface -> an interface that doesn't have any declared or defined
// methods, is called a Marker Interface.

// example of Marker interfaces are :-
// 1. RandomAccess interface in java.util package
// 2. Serializable interface in java.io package
// 3. Cloneable interface in java.lang package
// 4. EventListener interface in java.util package

// Functional Interface -> an interface that exactly have only one declared
// method is called a Functional Interface.
// Functional interface must have exactly one method declared in it.
// Functional interface can't have two declared methods.
// Function overloading is not allowed in a Functional Interface.
//method overloading is not allowed in the functional interface

// example of Functional Interface are :-
// 1. Closeable interface in java.io package has one method (public void close()
// throws IOException[checked])

// 2. Runnable interface in java.lang package has one method named (public void
// run())

// 3. Callable<V> interface in java.util.concurrent package has one method named
// (V call() throws Exception[unchecked] )

// 4. ActionListener interface in java.awt.event package has one method named
// (void actionPerformed())


// @FunctionalInterface is a general purpose annotation in java.lang package
// that is used for compilation check that an interface is a Functional Interface or not
// a subinterface of a functional interface can be a functional interface if and only if it has no methods or it has one method declared with same method signature as that of the parent interface.

// lambda expression is only applicable on creating the objects of the functional interface.
// when we use lambda function, then after compilation no new      .class file is created specifically for the lambda expression
