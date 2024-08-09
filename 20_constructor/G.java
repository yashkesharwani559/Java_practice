public class G {
    String name;
    int age;

    G(String name, int age) {
        name = name;
        age = age;
    }

    G() {

    }

    public static void main(String[] args) {
        G x = new G("yash", 20);
        System.out.println(x.name);
        System.out.println(x.age);

        G y = new G();
        System.out.println(y.name);
        System.out.println(y.age);

    }
}

// this will print output as
// null
// 0
// null
// 0