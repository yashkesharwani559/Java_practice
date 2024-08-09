public class A {
    {
        System.out.println(this);
        // System.out.println(super);//error because we cannot use super keyword anywhere
    }
    public static void main(String[] args){

    }
}


// A.java:4: error: '.' expected
//         System.out.println(super);//error because we cannot use super keyword anywhere
//                                 ^
// 1 error
// error: compilation failed