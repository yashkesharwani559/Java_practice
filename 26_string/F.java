public class F {
    public static void main(String[] args){
        String s = new String("mohan");

        for(char c : s){//compilation error

        }

    }
}
//F.java:5: error: for-each not applicable to expression type
//         for(char c : s){//compilation error
//                      ^
//   required: array or java.lang.Iterable
//   found:    String
// 1 error
// error: compilation failed