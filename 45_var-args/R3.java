public class R3 {
    static void abc((int...)... a){//compilation fail
        for(int[] ar : a){
            for(int next : ar){
                System.out.println(next);
            }
        }
    }
}

// R3.java:2: error: illegal start of type
//     static void abc((int...)... a){//compilation fail
//                     ^
// R3.java:2: error: <identifier> expected
//     static void abc((int...)... a){//compilation fail
//                         ^
// R3.java:2: error: <identifier> expected
//     static void abc((int...)... a){//compilation fail
//                                  ^
// 3 errors
// error: compilation failed