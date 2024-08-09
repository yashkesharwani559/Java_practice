public class E2 extends E10 {
    // E10(){}

    public static void main(String[] args) {

    }
}

class E10 {
    E10() {

    }
}

// this will give error because constructor overriding is not allowed in java

// E2.java:2: error: invalid method declaration; return type required
// E(){}
// ^
// 1 error
// error: compilation failed

//constructor overriding is not allowed in java because constructor is not inherited from the parent class to the child class