public class B {
    B(){
        System.out.println(this);
        System.out.println(super);//this will give error because we cannot directly write super only
    }
}
// B.java:4: error: '.' expected
//         System.out.println(super);//this will give error because we cannot directly write super only
//                                 ^
// 1 error
