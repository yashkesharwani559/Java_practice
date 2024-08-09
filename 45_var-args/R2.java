public class R2 {
    static void abc(int...... a){//compilation fail
        for(int[] ar : a){
            for(int next : ar){
                System.out.println(next);
            }
        }
    }
}

// R2.java:2: error: <identifier> expected
//     static void abc(int...... a){//compilation fail
//                           ^
// 1 error
// error: compilation failed