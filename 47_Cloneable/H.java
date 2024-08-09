
public class H {
    public static void main(String[] args) {

        AD a1 = new AD("arun", 26);

        AD a2 = (AD)a1.clone();// compilation fail
        // because clone() method has protected access and that's why can be used by same object of same subclass of class object
    }
}

// D.java:7: error: incompatible types: Object cannot be converted to AD
//         AD a2 = a1.clone();// compilation fail
//                         ^
// 2 errors
// error: compilation failed

class AD {
    String name;
    int age;

    AD(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }
}