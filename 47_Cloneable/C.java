public class C {
    public static void main(String[] args) {
        C b = new C();
        C b1 = (C) b.clone();//compilation fail
        // because clone() method throws CloneableNotSupportedException.

    }
}
// CloneNotSupportedException -> is a checked exception in java because it is the direct child of the Exception class and this exception is present in java.lang package and that's why no need to import it