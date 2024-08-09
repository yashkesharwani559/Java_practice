public class A1 {
    static{
        // System.out.println(this);//error because we cannot use any of this and super keyword inside the static block
        // System.out.println(super);//error because we cannot use super keyword anywhere
    }
    public static void main(String[] args){

    }
}

// A1.java:3: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this);//error because we cannot use any of this and super keyword inside the static block
//                            ^
// 1 error
// error: compilation failed

// A1.java:4: error: '.' expected
//         System.out.println(super);//error because we cannot use super keyword anywhere
//                                 ^
// 1 error
// error: compilation failed