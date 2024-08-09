class A {
    // There are two context in java
    // 1. class context :- static methods create class context
    // 2. instance context :- non-static/instance methods create instance context

    // if variable or method is used directly inside a method then its context is
    // decided by the method only
    // and if it is used with something.member-name then this something decides the
    // context of the variable and method members

    // something can be
    // class-name.member-name :- here the member used must be static
    // object/instance(of a class).member-name :-here the member can be both static
    // and non-static but it is recommended to use non-static members only

}