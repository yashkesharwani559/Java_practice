public class T1 {
    public static void main(String[] args){
        
    }

    static <N> N process(){
        N n = new N();//not allowed
        return n;
    }
}
// T1.java:7: error: unexpected type
//         N n = new N();//not allowed
//                   ^
//   required: class
//   found:    type parameter N
//   where N is a type-variable:
//     N extends Object declared in method <N>process()
// 1 error
// error: compilation failed