class A {
    public static void main(String[] args) {
        // System.out.println(y);// this will first find inside the method for a local
        // variable y and if he not find it here then it search y in the class directly
        // for static variable y since here it is not created it will give error

    }
}

class Z {
    static int y;
}
// so basically a class cannot see any variable and method of another class by
// itself

// A.java:3: error: cannot find symbol
// System.out.println(y);// this will first find inside the method for a local
// ^
// symbol: variable y
// location: class A
// 1 error
