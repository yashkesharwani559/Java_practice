public class B1 {
    void pro(){
        System.out.println(this);
        System.out.println(super);//this will give error because we cannot directly use super keyword
    }
}

// B1.java:4: error: '.' expected
//         System.out.println(super);//this will give error because we cannot directly use super keyword
//                                 ^
// 1 error