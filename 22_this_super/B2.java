public class B2 {
    static{
        System.out.println(this);
        System.out.println(super);

    }
}
// B2.java:4: error: '.' expected
//         System.out.println(super);
//                                 ^
// 1 error

// B2.java:3: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this);
//                            ^
// 1 error