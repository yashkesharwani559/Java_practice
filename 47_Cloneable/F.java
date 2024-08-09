public class F implements Cloneable {
    F() {
        System.out.println("hii");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        F b = new F();
        F b1 = (F) b.clone();
        System.out.println(b1);
    }
}
// hii
// F@44ebcd03

// here hii is called once which means that to create the same new object the clone() method doesn't calls the constructor again