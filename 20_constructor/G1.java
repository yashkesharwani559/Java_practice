public class G1 {
    String name;
    int age;

    G1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    G1() {

    }

    public static void main(String[] args) {
        G1 x = new G1("yash", 20);
        System.out.println(x.name);
        System.out.println(x.age);
        
        G1 y = new G1();
        System.out.println(y.name);
        System.out.println(y.age);
        
    }
}

//this will print as
// yash
// 20
// null
// 0