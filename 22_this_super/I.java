class Z {
    Z x = new Z();

    public static void main(String[] args) {
        // Z c = new Z()
    }
}

//this code will not give any error but gives runtime exception as stackOverflowError because here the object of same class Z is created as a variable in the object and is always created when the object is created 
// so that's why this follows infinite recursion
// to stop this infinite recursion at runtime we must press Ctrl+z to terminate the execution of the program

// Exception in thread "main" java.lang.StackOverflowError
//         at Z.<init>(L.java:2)
//         at Z.<init>(L.java:2)
//         at Z.<init>(L.java:2)