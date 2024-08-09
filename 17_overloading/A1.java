class A1 {
    void pro()  
        System.out.println("hii");
    }

    void pro(int x) {
        System.out.println("hello");
    }
}
// when we redefine the method inside a class with same name but different parameters then we perform method overloading.
// also method overloading helps in compile-time polymorphism
//the only principle we have to remember to perform method overloading is that the parameter body must mismatch between all the redefining methods