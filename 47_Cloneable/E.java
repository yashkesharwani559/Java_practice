public class E {
    public static void main(String[] args) throws CloneNotSupportedException {
        E b = new E();
        E b1 = (E) b.clone();// thrown the CloneNotSupporteEException because the E class doesn't implements the Cloneable interface

    }
}
