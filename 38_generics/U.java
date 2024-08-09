public class U {
    <N> U(N n) {
        System.out.println(n);
    }

    public static void main(String[] args) {
        U u = new U("mohan");
        System.out.println(u);
    }
}
// means typesafety is allowed in class, interface, method and constructor

// mohan
// U@28eaa59a