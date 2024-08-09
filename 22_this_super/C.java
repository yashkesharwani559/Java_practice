public class C extends A1 {
    int x = 34;

    C() {
        // super(this.x);//part 1
        // super(super.x);//part 2
        super(10);
        int x = 32;
        System.out.println(x);//32
        System.out.println(this.x);//34
    }
}

class A1 {
    int x = 56;

    A1(int x) {

    }
}

//part 1
// C.java:5: error: cannot reference this before supertype constructor has been called
//         super(this.x);
//               ^
// 1 error

//part 2
// C.java:6: error: cannot reference super before supertype constructor has been called
//         super(super.x);//part 2
//               ^
// 1 error