class A {
    int x = 23;
}

public class D4 extends A {
    int x = 89;
    public static void main(String[] args) {
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
//this will give error because super and this keyword can't be used in static context that is from static methods

//this and super keywords are used to reference instance context

// D4.java:8: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this.x);
//                            ^
// D4.java:9: error: non-static variable super cannot be referenced from a static context
//         System.out.println(super.x);
//                            ^
// 2 errors