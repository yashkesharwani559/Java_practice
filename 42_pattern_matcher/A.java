class A {
    public static void main(String[] args) {
        Pattern p;//compilation fail
    }
}

// Pattern -> class is a class present in the java.util.regex package. So we have to import it.
// public final class Pattern extends Object implements Serializable -> is the signature of the class Pattern
// means the Pattern class is final 
// private Pattern(String p, int f) -> constructor is there in the Pattern class that takes String p and int f as argument.
// but this constructor is private which means that we can't create object of the Pattern class using this constructor.
// So to create the object of pattern class we have compile() method